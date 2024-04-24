package com.example.mongo_db_crud.repo;

import com.example.mongo_db_crud.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, Long> {
}
