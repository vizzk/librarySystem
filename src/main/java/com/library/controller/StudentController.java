package com.library.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.library.pojo.ResultInfo;
import com.library.pojo.Student;
import com.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author ：Vizzk
 * @description：学生控制器
 * @date ：2021/3/28 20:18
 */
@Controller
public class StudentController {
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/studentLogin")
    @ResponseBody
    public String studentLogin(String account, String password){
        //event: 0 不存在账号  1成功  2密码错误
        Student student = studentService.getStudentByID(account);
        ResultInfo response;
        Boolean ispass = false;
        if(student == null){
            response = new ResultInfo("fail",0);
        }
        else {
            if(student.getPassword().equals(password)){
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
