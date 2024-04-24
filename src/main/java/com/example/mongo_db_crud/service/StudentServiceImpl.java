package com.example.mongo_db_crud.service;

import com.example.mongo_db_crud.entity.Student;
import com.example.mongo_db_crud.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void getAll() {
        studentRepo.findAll();
    }

    @Override
    public void update(Student student, Long id) {
        Student student1 = studentRepo.findById(id).orElse(null);

        if (student1 != null) {
            student1 = studentRepo.save(student);
            System.out.println(student1.getName());
        }
    }
}
