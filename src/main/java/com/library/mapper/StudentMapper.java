package com.library.mapper;

import com.library.pojo.Student;

public interface StudentMapper {
    Student getStudentById(String number);
    int insertStudent(Student student);
}
