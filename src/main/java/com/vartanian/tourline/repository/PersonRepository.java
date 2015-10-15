package com.vartanian.tourline.repository;

import com.vartanian.tourline.models.Person;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
public interface PersonRepository {
    List<Person> findByLastName(String name);
}
