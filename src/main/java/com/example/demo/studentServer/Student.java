package com.example.demo.studentServer;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.Valid;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;

@Entity
public class Student {
    @GeneratedValue
    @Id
    int id;

    @NotNull
    String name;


    @NotBlank(message = "Department cannot be blank")
    @Size(min = 2, max = 50, message = "Department must be between 2 and 50 characters")
    String deparment;

    @Min(value = 1, message = "Registration number must be at least 1")
    @Max(value = 999999, message = "Registration number cannot exceed 999999")
    int regNo;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDeparment() {
        return deparment;
    }
    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    private LocalDateTime createdAt;
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
