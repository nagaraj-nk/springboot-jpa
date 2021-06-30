package com.srjons.springbootjpa.repository;

import com.srjons.springbootjpa.model.Mobile;
import com.srjons.springbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
