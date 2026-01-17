package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;

    @Override
    public void addStudent(StudentDto studentDto) {
        studentRepository.save(studentDto);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(studentDto);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDto> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDto searchById(Integer id) {
        return studentRepository.findById(id).get();
    }
}
