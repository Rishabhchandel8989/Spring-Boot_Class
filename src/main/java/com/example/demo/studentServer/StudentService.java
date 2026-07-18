package com.example.demo.studentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentService {

//    @Autowired
   private final StudentRepositry studentRepositry;
   @Autowired
    public StudentService(StudentRepositry studentRepositry) {
        this.studentRepositry=studentRepositry;
    }

    public Student studentValidate(Student student) {

        String name=student.getName();
        int id=student.getId();
        String deparment=student.getDeparment();
        int reg= student.getRegNo();


        student.setCreatedAt(LocalDateTime.now());

        if(id<0 || name== null || deparment==null || reg<0){
            return null;
        }



        studentRepositry.save(student);
        return student;

    }

    public List<Student> getAllStudents() {
        return studentRepositry.findAll();
    }

    public List<Student> getStudentDetailByRegNumber() {
       return studentRepositry.
    }
}
