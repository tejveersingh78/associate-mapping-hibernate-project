package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class FindALL {
    public static void main(String[] args) {
        List<Student> studentList = new StudentRepositoryImpl().findAll();
            for(Student student : studentList){
                System.out.println(student);
            }
    }
}
