package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;

public class SaveStudent {
    public static void main(String[] args) {
        Address address = new Address("Khurrampur ","Kantaur","Bhatikara Road","kasganj","Uttar Pradesh","207123");
        Student student = new Student("Hirdesh","kumar","hk@gmail.com","8979830889","B.Sc",address);
        StudentService studentService = new StudentServiceImpl();
        studentService.saveStudent(student);
    }
}
