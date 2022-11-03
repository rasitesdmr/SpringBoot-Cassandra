package com.example.springbootcassandra.service;

import com.example.springbootcassandra.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudentList();

    Student getByStudentId(int studentNumber);

    Student createStudent(Student student);

    Student updateStudent(int studentNumber , Student student);

    void deleteStudent(int studentNumber);
}
