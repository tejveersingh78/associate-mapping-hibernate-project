package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;


import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.updateStudent(student,id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        studentRepository.delete(id);

    }
}