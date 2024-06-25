package com.example.school.Service;

import com.example.school.Entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
    Teacher createTeacher(Teacher teacher);
    Teacher updateTeacher(int id, Teacher teacher);
    void deleteTeacher(int id);
}

