package com.library.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.library.pojo.Borrow;
import com.library.pojo.ResultInfo;
import com.library.service.BorrowService;
import com.library.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/4/5 15:01
 */
@Controller
public class BorrowController {
    @Autowired
    @Qualifier("borrowServiceImpl")
    private BorrowService borrowService;

    @ResponseBody
    @RequestMapping("/borrowRecord")
    public String getBorrowRecord(@RequestBody JSONObject json) throws ParseException {
        //传入学号查询学生借书记录
        //event 0正常
        String account = (String) json.get("account");
        ResultInfo response = new ResultInfo("success",0);
        List<Borrow> list = borrowService.getBorrowBooksByStudentID(account);
        if(list.isEmpty()){
            response.setEvent(1);
        }
        Iterator<Borrow> iterator = list.iterator();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        while(iterator.hasNext()){
            Borrow record = iterator.next();
            if(!record.isVisible()){
                iterator.remove();
                continue;
            }
            date = df.parse(record.getBorrowDate());
            int rest = Util.getRestDay(date,record.getResting());
            record.setResting(rest);
        }
        response.setData(list);
        return JSON.toJSONString(response);
    }

    @RequestMapping(value = "/hideRecord",method = RequestMethod.GET)
    @ResponseBody
    public String hideRecord(int order){
        ResultInfo response = new ResultInfo("success",0);
        int result = borrowService.updateRecordOnVisible(order);
        if(result == 0){
            response.setEvent(1);
            response.setMsg("fail");
        }
        return JSON.toJSONString(response);
    }
}