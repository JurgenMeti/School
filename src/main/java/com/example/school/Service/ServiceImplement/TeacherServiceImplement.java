package com.example.school.Service.ServiceImplement;
import com.example.school.Entities.Teacher;
import com.example.school.Repository.TeacherRepository;
import com.example.school.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(int id) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        return optionalTeacher.orElse(null);
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacher(int id, Teacher teacher) {
        if (teacherRepository.existsById(id)) {
            teacher.setID(id);
            return teacherRepository.save(teacher);
        }
        return null;
    }

    @Override
    public void deleteTeacher(int id) {
        teacherRepository.deleteById(id);
    }
}

