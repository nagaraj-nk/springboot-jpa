package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.DifferentPerson;
import com.srjons.springbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DifferentPersonRepository extends JpaRepository<DifferentPerson, Integer> {
    DifferentPerson findPersonById(int id);
}
