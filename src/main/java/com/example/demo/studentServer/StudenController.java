package com.example.demo.studentServer;

import com.example.demo.studentServer.DTO.CreateStudentRequestDTO;
import com.example.demo.studentServer.DTO.CreateStudentResponseDTO;
import com.example.demo.studentServer.DTO.UpdateStudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudenController {

//     Wiring the serveice class to controller class
        StudentService studentService;
        @Autowired
        public StudenController(StudentService studentService) {
            this.studentService=studentService;
        }

//        Get All the Student
        @GetMapping("student")
        public List<Student> getAllStudent(){
            return studentService.getAllStudents();
        }
//     Get the student by there ID
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/create")
    public ResponseEntity<CreateStudentResponseDTO> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO){
       CreateStudentResponseDTO result= studentService.studentValidate(createStudentRequestDTO);

        if(result==null){
            return ResponseEntity.status(400).body(null);
        }

        return ResponseEntity.status(201).body(result);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<CreateStudentResponseDTO> updateStudent(
            @PathVariable int id,
            @RequestBody UpdateStudentRequestDTO updateStudentRequestDTO) {

        CreateStudentResponseDTO response =
                studentService.updateStudent(id, updateStudentRequestDTO);

        return ResponseEntity.ok(response);
    }

}
