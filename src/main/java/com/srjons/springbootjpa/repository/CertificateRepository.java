package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.Certificate;
import com.srjons.springbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
    Certificate findCertificateById(int id);
}
