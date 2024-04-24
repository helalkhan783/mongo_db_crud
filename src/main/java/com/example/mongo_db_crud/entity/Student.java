package com.example.mongo_db_crud.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Student {
    @Id
    private Long id;
    private Integer rollNo;
    private String Name;
    private String address;
}
