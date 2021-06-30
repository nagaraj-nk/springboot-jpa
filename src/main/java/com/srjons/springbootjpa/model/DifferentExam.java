package com.srjons.springbootjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Table(name = "exam")
@Entity
public class DifferentExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany()
    @JoinTable(name = "person_exam",
            joinColumns = @JoinColumn(name = "exam_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    private List<DifferentPerson> persons;

    public List<DifferentPerson> getPersons() {
        return persons;
    }

    public void setPersons(List<DifferentPerson> persons) {
        this.persons = persons;
    }


    public DifferentExam() {
        super();
    }

    public DifferentExam(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
