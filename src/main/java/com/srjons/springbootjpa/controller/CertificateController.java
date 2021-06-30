package com.srjons.springbootjpa.controller;

import com.srjons.springbootjpa.model.Certificate;
import com.srjons.springbootjpa.model.Person;
import com.srjons.springbootjpa.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    CertificateRepository certificateRepository;

    @GetMapping
    public List<Certificate> findAll() {
        return certificateRepository.findAll();
    }

    @GetMapping("/{id}")
    public Certificate findById(@PathVariable("id") int id) {
        return certificateRepository.findCertificateById(id);
    }
}
