package com.example.demo.studentServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudenController {

//     Wiring the serveice class to controller class
        StudentService studentService;
        @Autowired
        public StudenController(StudentService studentService) {
            this.studentService=studentService;
        }


    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student ){
       Student result= studentService.studentValidate(student);

        if(result==null){
            return ResponseEntity.status(400).body(null);
        }

        return ResponseEntity.status(201).body(result);
    }

}
