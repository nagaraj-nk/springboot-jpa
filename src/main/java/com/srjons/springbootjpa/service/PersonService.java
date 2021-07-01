package com.srjons.springbootjpa.service;

import com.srjons.springbootjpa.model.Person;
import com.srjons.springbootjpa.model.PersonName;
import com.srjons.springbootjpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    @PersistenceContext
    EntityManager entityManager;

    public void updateCertificate(Person person) {
        personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findPersonById(int id) {
        return personRepository.findPersonById(id);
    }

    public PersonName findPersonNameById(int id) {
        return new PersonName(personRepository.findPersonaNameByNativeQuery(id).getName());
    }
}
