package com.library.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.library.pojo.ResultInfo;
import com.library.pojo.Student;
import com.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


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
    public String studentLogin(HttpServletRequest request){
        //event: 0 不存在账号  1成功  2密码错误
        String account = (String)request.getAttribute("account");
        String password = (String)request.getAttribute("password");
        Student student = studentService.getStudentByID(account);
        ResultInfo response;
        JSONObject jsonObject = new JSONObject();
        Boolean ispass = false;
        if(student == null){
            response = new ResultInfo("fail",0);
        }
        else {
            if(student.getPassword().equals(password)){
                ispass = true;
                response = new ResultInfo("success",1);
                jsonObject.put("account",student.getNumber());
                jsonObject.put("name",student.getName());
            }
            else{
                response =new ResultInfo("fail",2);
            }
        }
        jsonObject.put("isPass",ispass);
        response.setData(jsonObject);
        return JSON.toJSONString(response);
    }

    @ResponseBody
    @RequestMapping("/getStudent")
    public String studentInfo(@RequestBody JSONObject json){
        //1查无此人  0查询成功
        String account = (String) json.get("account");
        Student student = studentService.getStudentByID(account);
        ResultInfo response = new ResultInfo("success",0);
        if(student == null){
            response.setEvent(1);
        }
        response.setData(student);
        return JSON.toJSONString(response);
    }

    @ResponseBody
    @RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
    public String insertStudent(@RequestBody JSONObject request){
        ResultInfo response = new ResultInfo("success", 0);

        Student student = JSONObject.toJavaObject(request, Student.class);
        int i = studentService.insertStudent(student);
        if(i != 1){
            response.setMsg("fail");
            response.setEvent(1);
        }

        return JSONObject.toJSONString(response);


    }

}
