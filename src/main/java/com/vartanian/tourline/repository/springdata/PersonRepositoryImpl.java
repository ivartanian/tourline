package com.vartanian.tourline.repository.springdata;

import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
public interface PersonRepositoryImpl extends PersonRepository, MongoRepository<Person, String> {

    @Override
    @Query("{age : { $lt : 50 }}")
    void dropCollection(Class<Person> entityClass);

}
