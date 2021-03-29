package com.library.service;

import com.library.mapper.StudentMapper;
import com.library.pojo.Student;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/27 17:09
 */
public class StudentServiceImpl implements StudentService{
    private StudentMapper mapper;

    public void setMapper(StudentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Student getStudentByID(String number) {
        return mapper.getStudentById(number);
    }

    @Override
    public int insertStudent(Student student) {
        return mapper.insertStudent(student);
    }
}
