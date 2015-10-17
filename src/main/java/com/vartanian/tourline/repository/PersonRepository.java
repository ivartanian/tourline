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

    List<Person> findAll();

    Person findOne(String id);

    Person insert(Person entity);

    void delete(Person entity);

    Person findByName(String name);
}
