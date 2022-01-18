package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Student student = new StudentServiceImpl().findById(4L);
        System.out.println(student);
    }
}