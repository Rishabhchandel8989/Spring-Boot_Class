package com.example.demo.studentServer.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudentRequestDTO {
    private String name;
    private String deparment;
    private int regNo;


}
