package com.example.mongo_db_crud.service;

import com.example.mongo_db_crud.entity.Student;

public interface StudentService {
    void saveStudent(Student student);

    void getAll();

    void update(Student student,Long id);
}
