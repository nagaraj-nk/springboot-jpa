package com.srjons.springbootjpa.controller;

import com.srjons.springbootjpa.model.DifferentExam;
import com.srjons.springbootjpa.repository.DifferentExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired
    DifferentExamRepository examRepository;

    @GetMapping
    public List<DifferentExam> findAll() {
        return examRepository.findAll();
    }

    @GetMapping("/{id}")
    public DifferentExam findById(@PathVariable("id") int id) {
        return examRepository.findExamById(id);
    }

}
