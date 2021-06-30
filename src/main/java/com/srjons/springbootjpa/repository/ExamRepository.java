package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Integer> {
}
