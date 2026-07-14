package com.example.demo.studentServer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositry {

    public Student save(Student student){

        System.out.println("Student informationis save");


        return student;
    }
}
