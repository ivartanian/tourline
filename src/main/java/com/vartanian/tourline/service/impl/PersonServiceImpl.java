package com.vartanian.tourline.service.impl;

import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import com.vartanian.tourline.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;


    @Override
    public List<Person> findByLastName(String name) {
        return personRepository.findByLastName(name);
    }
}
