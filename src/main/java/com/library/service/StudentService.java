package com.library.service;

import com.library.pojo.Student;

public interface StudentService {
    Student getStudentByID(String number);
    int insertStudent(Student student);
}
