package com.example.springbootcassandra.controller;

import com.example.springbootcassandra.model.Student;
import com.example.springbootcassandra.service.StudentService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/studentList")
    public ResponseEntity<List<Student>> getAllStudent() {
        return new ResponseEntity<>(studentService.getAllStudentList(),HttpStatus.OK);
    }

    @GetMapping("/getStudent/{studentNumber}")
    public ResponseEntity<Student>getByStudentId(@PathVariable(value = "studentNumber") int studentName){
        return new  ResponseEntity<>(studentService.getByStudentId(studentName),HttpStatus.OK);
    }

    @PostMapping("/createStudent")
    public ResponseEntity<Student>createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.createStudent(student),HttpStatus.CREATED);
    }
    @PutMapping("/updateStudent/{studentNumber}")
    public ResponseEntity<Student>updateStudent(@PathVariable(value = "studentNumber") int studentNumber,Student student){
        return new ResponseEntity<>(studentService.updateStudent(studentNumber,student),HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteStudent/{studentNumber}")
    public void deleteStudent(@PathVariable(value = "studentNumber") int studentNumber){
        studentService.deleteStudent(studentNumber);
    }


}
