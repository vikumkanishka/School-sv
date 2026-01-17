package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Student")
public class StudentController {

    final StudentService studentService;

    @GetMapping("/get-all")
    public List<StudentDto> getAll(){
        return studentService.getAll();
    }

    @PostMapping("/add")
    public void addStudent(StudentDto studentDto){
        studentService.addStudent(studentDto);
    }

    @PutMapping("/update")
    public void updateStudent(StudentDto studentDto){
        studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteStudent(Integer id){
        studentService.deleteStudent(id);
    }
    @GetMapping("search-by-id/{id}")
    public StudentDto searchById(Integer id){
        return studentService.searchById(id);
    }
}
