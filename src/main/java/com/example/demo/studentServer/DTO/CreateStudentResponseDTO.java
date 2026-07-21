package com.example.demo.studentServer.DTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateStudentResponseDTO {
    private int id;
    private String name;
    private String department;
    private int regNo;

}
