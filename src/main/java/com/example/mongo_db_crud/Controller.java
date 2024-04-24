package com.example.mongo_db_crud;

import com.example.mongo_db_crud.annotations.ApiController;
import com.example.mongo_db_crud.entity.Student;
import com.example.mongo_db_crud.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@ApiController
@RequestMapping("/student")
@AllArgsConstructor
public class Controller {
    private final StudentService studentService;

    @PostMapping("/create")
    public void addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping("/getAll")
    public void getAll() {
        studentService.getAll();
    }


    @PutMapping("/update/{id}")
    public void update(@RequestBody Student student,@PathVariable Long id) {
        studentService.update(student,id);
    }
}
