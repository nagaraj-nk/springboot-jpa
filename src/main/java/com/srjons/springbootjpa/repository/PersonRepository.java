package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findPersonById(int id);


}
