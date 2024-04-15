package com.example.seisaku2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import com.example.seisaku2.model.StudentManage;
import com.example.seisaku2.repository.StudentRepository;
 

@Service
@Transactional
public class  StudentService{

    @Autowired
    private StudentRepository repository;


    public void save(@NonNull StudentManage student) {
        this.repository.save(student);
    }

}