package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(StudentDto studentDto) {

    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public List<StudentDto> getAll() {
        ArrayList <StudentDto> students = new ArrayList<>();
        return students;
    }

    @Override
    public List<StudentDto> searchByName(String name) {
        return List.of();
    }
}
