package com.example.demo.studentServer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;

@Entity
public class Student {
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
    @Id
    int id;
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    @NotNull
    String name;
    String deparment;
    int regNo;
    private LocalDateTime createdAt;
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
