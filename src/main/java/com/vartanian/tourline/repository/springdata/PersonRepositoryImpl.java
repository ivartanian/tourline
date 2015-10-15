package com.vartanian.tourline.repository.springdata;

import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
public interface PersonRepositoryImpl extends PersonRepository, MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("name") String name);

}
