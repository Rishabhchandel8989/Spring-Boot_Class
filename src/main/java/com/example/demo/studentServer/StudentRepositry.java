package com.example.demo.studentServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer> {
    boolean existsByRegNo(int regNo);
}
