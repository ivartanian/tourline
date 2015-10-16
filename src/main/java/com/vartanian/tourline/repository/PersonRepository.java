package com.vartanian.tourline.repository;

import com.mongodb.WriteResult;
import com.vartanian.tourline.models.Person;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
public interface PersonRepository {

    List<Person> findAll(Class<Person> entityClass);

    Person insert(Person objectToSave);

    Person findById(Person id, Class<Person> entityClass);

    WriteResult updateFirst(Query query, Update update, Class<Person> entityClass);

    Person findOne(Query query, Class<Person> entityClass);

    WriteResult remove(Person person);

    void dropCollection(Class<Person> entityClass);

}
