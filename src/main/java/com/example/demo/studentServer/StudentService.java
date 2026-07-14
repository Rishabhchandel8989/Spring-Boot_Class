package com.example.demo.studentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

//    @Autowired
    StudentRepositry studentRepositry;
    public StudentService(StudentRepositry studentRepositry) {
        this.studentRepositry=studentRepositry;
    }

    public Student studentValidate(Student student) {

        String name=student.getName();
        int id=student.getId();
        String deparment=student.getDeparment();

        if(id<0 || name== null || deparment==null){
            return null;
        }
        studentRepositry.save(student);
        return student;

    }
}
