package com.example.seisaku2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.seisaku2.model.StudentManage;

@Repository
public interface StudentRepository  extends JpaRepository<StudentManage, String>{

}