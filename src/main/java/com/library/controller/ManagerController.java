package com.library.controller;

import com.alibaba.fastjson.JSON;
import com.library.pojo.Manager;
import com.library.pojo.ResultInfo;
import com.library.pojo.Student;
import com.library.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：Vizzk
 * @description：管理员控制器
 * @date ：2021/3/29 20:08
 */
@Controller
public class ManagerController {
    @Autowired
    @Qualifier("managerServiceImpl")
    private ManagerService managerService;

    @ResponseBody
    @RequestMapping("/managerLogin")
    public String ManagerLogin(String account, String password){
        //event: 0 不存在账号  1成功  2密码错误
        Manager manager = managerService.getManagerByID(account);
        ResultInfo response;
        Boolean ispass = false;
        if(manager == null){
            response = new ResultInfo("fail",0);
        }
        else {
            if(manager.getPassword().equals(password)){
                ispass = true;
                response = new ResultInfo("success",1);
            }
            else{
                response =new ResultInfo("fail",2);
            }
        }
        response.setObj(ispass);
        return JSON.toJSONString(response);
    }
}
