package com.example.springbootcassandra.service;

import com.example.springbootcassandra.exception.ResourceNotFoundException;
import com.example.springbootcassandra.model.Student;
import com.example.springbootcassandra.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByStudentId(int studentNumber) {
        return studentRepository.findById(studentNumber).orElseThrow(() -> new ResourceNotFoundException(studentNumber + " numarasına ait öğrenci bulunamadı!"));
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student) ;
    }

    @Override
    public Student updateStudent(int studentNumber, Student student) {
        Student currentStudent = getByStudentId(studentNumber);
        currentStudent.setFirstName(student.getFirstName());
        currentStudent.setLastName(student.getLastName());
        currentStudent.setEmail(student.getEmail());
        return studentRepository.save(currentStudent);
    }

    @Override
    public void deleteStudent(int studentNumber) {
        Student currentStudent = getByStudentId(studentNumber);
        studentRepository.delete(currentStudent);
    }
}
