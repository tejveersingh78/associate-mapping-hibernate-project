package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class UpdateStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Pravendra");
        new StudentServiceImpl().updateStudent(student,3L);
    }
}
