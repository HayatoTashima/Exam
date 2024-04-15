package com.example.seisaku2.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.seisaku2.service.ScoreService;
import com.example.seisaku2.service.StudentService;
import com.example.seisaku2.service.SubjectService;
 
@Controller
public class MainController {
	@Autowired
	private ScoreService ScoreService;
	@Autowired
	private StudentService StudentService;
	@Autowired
	private SubjectService SubjectService;
 
 
@GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "こんにちは");
    return "top";
  }


}