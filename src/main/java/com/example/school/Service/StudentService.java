package com.example.school.Service;

import com.example.school.Entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student createStudent(Student student);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
}

