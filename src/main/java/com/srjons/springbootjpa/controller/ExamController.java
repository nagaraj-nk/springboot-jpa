package com.srjons.springbootjpa.controller;

import com.srjons.springbootjpa.model.DifferentExam;
import com.srjons.springbootjpa.model.Exam;
import com.srjons.springbootjpa.repository.DifferentExamRepository;
import com.srjons.springbootjpa.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired
    DifferentExamRepository differentExamRepository;

    @Autowired
    ExamRepository examRepository;

    @GetMapping
    public List<DifferentExam> findAll() {
        return differentExamRepository.findAll();
    }

    @GetMapping("/{id}")
    public DifferentExam findById(@PathVariable("id") int id) {
        return differentExamRepository.findExamById(id);
    }

    @PostMapping("/create")
    public void addExam(@RequestBody Exam exam) {
        examRepository.save(exam);
    }

}
