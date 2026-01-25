package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;
    final ModelMapper mapper;

    @Override
    public void addStudent(StudentDto studentDto) {
        StudentEntity studentEntity = mapper.map(studentDto, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        StudentEntity studentEntity = mapper.map(studentDto, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDto studentDto = mapper.map(studentEntity, StudentDto.class);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }

    @Override
    public StudentDto searchById(Integer id) {
        return mapper.map(studentRepository.findById(id).get(), StudentDto.class);
    }
}
