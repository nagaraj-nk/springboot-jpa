package com.srjons.springbootjpa.service;

import com.srjons.springbootjpa.model.Mobile;
import com.srjons.springbootjpa.model.Person;
import com.srjons.springbootjpa.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class MobileService {

    @Autowired
    MobileRepository mobileRepository;

    public Mobile findMobileById(int id) {
        return mobileRepository.findById(id).get();
    }

    public List<Mobile> findAll() {
        return mobileRepository.findAll();
    }
}
