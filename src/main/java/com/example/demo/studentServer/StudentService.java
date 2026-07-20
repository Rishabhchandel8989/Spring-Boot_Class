package com.example.demo.studentServer;
import com.example.demo.studentServer.DTO.CreateStudentRequestDTO;
import com.example.demo.studentServer.DTO.CreateStudentResponseDTO;
import com.example.demo.studentServer.DTO.UpdateStudentRequestDTO;
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

    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO) {
       Student student=mapToStudent(createStudentRequestDTO);
       studentRepositry.save(student);
       return mapToResposeDTO(student);
    }



    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {
       Student student=new Student();
       student.setName(createStudentRequestDTO.getName());
       student.setDeparment(createStudentRequestDTO.getDeparment());
       student.setRegNo(createStudentRequestDTO.getRegNo());

       return student;
    }

    public List<Student> getAllStudents() {
        return studentRepositry.findAll();
    }
    public Student getStudent(int id){
        return studentRepositry.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found")
                );
    }

    private CreateStudentResponseDTO mapToResposeDTO(Student student){
        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setRegNo(student.getRegNo());
        createStudentResponseDTO.setCreatedAt(student.getCreatedAt());

        return createStudentResponseDTO;
    }

    public CreateStudentResponseDTO updateStudent(
            int id,
            UpdateStudentRequestDTO updateStudentRequestDTO) {

        Student student = studentRepositry.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        student.setName(updateStudentRequestDTO.getName());
        student.setDeparment(updateStudentRequestDTO.getDeparment());

        studentRepositry.save(student);

        return mapToResposeDTO(student);
    }

}
