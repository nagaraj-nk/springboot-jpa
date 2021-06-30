package com.srjons.springbootjpa.controller;

import com.srjons.springbootjpa.model.Mobile;
import com.srjons.springbootjpa.model.Person;
import com.srjons.springbootjpa.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobiles")
public class MobileController {

    @Autowired
    MobileService mobileService;

    @GetMapping
    public List<Mobile> findAll() {
        return mobileService.findAll();
    }

    @GetMapping("/{id}")
    public Mobile findById(@PathVariable("id") int id) {
        return mobileService.findMobileById(id);
    }

}
