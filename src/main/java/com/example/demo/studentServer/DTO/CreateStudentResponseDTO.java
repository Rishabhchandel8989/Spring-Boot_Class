package com.example.demo.studentServer.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudentResponseDTO {

    private int id;
    private String name;
    private String department;
    private int regNo;
}
