package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findPersonById(int id);

    @Query(value = "select name from person where id = ?1", nativeQuery = true)
    PersonNameRepo findPersonaNameByNativeQuery(int id);

}
