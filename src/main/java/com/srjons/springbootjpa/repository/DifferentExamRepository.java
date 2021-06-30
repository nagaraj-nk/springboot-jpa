package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.DifferentExam;
import com.srjons.springbootjpa.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DifferentExamRepository extends JpaRepository<DifferentExam, Integer> {
    DifferentExam findExamById(int id);
}
