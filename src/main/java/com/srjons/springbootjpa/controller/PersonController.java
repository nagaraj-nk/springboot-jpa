package com.srjons.springbootjpa.controller;

import com.srjons.springbootjpa.model.Person;
import com.srjons.springbootjpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") int id) {
        return personService.findPersonById(id);
    }

    @PostMapping("/create")
    public void save(@RequestBody Person person) {
        personService.updateCertificate(person);
    }
}
