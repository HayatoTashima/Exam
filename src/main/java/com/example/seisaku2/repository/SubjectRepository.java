package com.example.seisaku2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.seisaku2.model.SubjectManage;

@Repository
public interface SubjectRepository  extends JpaRepository<SubjectManage, String>{

}