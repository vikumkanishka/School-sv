package edu.icet.repository;

import edu.icet.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDto, Integer> {
}
