package com.sunglowsys.test;

import com.sunglowsys.repository.StudentRepositoryImpl;

public class DeleteStudent {
    public static void main(String[] args) {
        new StudentRepositoryImpl().delete(4L);
    }
}
