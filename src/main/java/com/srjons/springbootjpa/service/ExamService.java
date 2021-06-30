package com.srjons.springbootjpa.service;

import com.srjons.springbootjpa.model.Exam;
import com.srjons.springbootjpa.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    ExamRepository examRepository;

    public List<Exam> findAll() {
        return examRepository.findAll();
    }

    public Exam findExamById(int id) {
        return examRepository.findById(id).get();
    }

    public void save(Exam exam) {
        examRepository.save(exam);
    }
}
