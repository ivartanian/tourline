package com.vartanian.tourline.service.impl;

import com.mongodb.WriteResult;
import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import com.vartanian.tourline.repository.springdata.PersonRepositoryImpl;
import com.vartanian.tourline.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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
    public void dropCollection(Class<Person> entityClass) {
        personRepository.dropCollection(entityClass);
    }

}
