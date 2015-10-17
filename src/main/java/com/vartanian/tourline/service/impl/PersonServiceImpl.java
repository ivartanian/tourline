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
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findOne(String id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person insert(Person entity) {
        return personRepository.insert(entity);
    }

    @Override
    public void delete(Person entity) {
        personRepository.delete(entity);
    }

    @Override
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

}
