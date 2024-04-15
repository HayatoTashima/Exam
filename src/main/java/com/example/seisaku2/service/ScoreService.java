package com.example.seisaku2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import com.example.seisaku2.model.ScoreManage;
import com.example.seisaku2.repository.ScoreRepository;
 

@Service
@Transactional
public class  ScoreService{

    @Autowired
    private ScoreRepository repository;


    public void save(@NonNull ScoreManage score) {
        this.repository.save(score);
    }

}