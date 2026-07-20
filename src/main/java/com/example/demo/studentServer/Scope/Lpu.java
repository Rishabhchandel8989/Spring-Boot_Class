package com.example.demo.studentServer.Scope;

import com.example.demo.studentServer.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singleton")
public class Lpu {
    public Lpu() {
        System.out.println("LPU constructor");
    }

    public void addmission(Student student){
        System.out.println("addmission");

    }
    public void exam(){
        System.out.println("exam");
    }
    public void preExam(){
        System.out.println("preexam");
    }
}
