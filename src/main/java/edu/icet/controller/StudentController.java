package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAll(){
        return studentService.getAll();
    }

    @PostMapping
    public void addStudent(StudentDto studentDto){
        studentService.addStudent(studentDto);
    }
    public void updateStudent(StudentDto studentDto){
        studentService.updateStudent(studentDto);
    }

    public void deleteStduent(Integer id){
        studentService.deleteStudent(id);
    }

    public List<StudentDto> searchByName(String name){
        return studentService.searchByName(name);
    }
}
