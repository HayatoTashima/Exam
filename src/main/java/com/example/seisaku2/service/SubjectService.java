package com.example.seisaku2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import com.example.seisaku2.model.SubjectManage;
import com.example.seisaku2.repository.SubjectRepository;
 

@Service
@Transactional
public class  SubjectService{

    @Autowired
    private SubjectRepository repository;


    public void save(@NonNull SubjectManage subject) {
        this.repository.save(subject);
    }

}