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
//@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    @Qualifier(value = "personRepositoryImpl")
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll(Class<Person> entityClass) {
        return personRepository.findAll(entityClass);
    }

    @Override
    public Person insert(Person objectToSave) {
        return personRepository.insert(objectToSave);
    }

    @Override
    public Person findById(Person id, Class<Person> entityClass) {
        return personRepository.findById(id, entityClass);
    }

    @Override
    public WriteResult updateFirst(Query query, Update update, Class<Person> entityClass) {
        return personRepository.updateFirst(query, update, entityClass);
    }

    @Override
    public Person findOne(Query query, Class<Person> entityClass) {
        return personRepository.findOne(query, entityClass);
    }

    @Override
    public WriteResult remove(Person person) {
        return personRepository.remove(person);
    }

    @Override
    public void dropCollection(Class<Person> entityClass) {
        personRepository.dropCollection(entityClass);
    }
}
