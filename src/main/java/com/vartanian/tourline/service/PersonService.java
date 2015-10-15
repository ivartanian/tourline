package com.vartanian.tourline.service;

import com.vartanian.tourline.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by super on 10/15/15.
 */
public interface PersonService {

    List<Person> findByLastName(String name);

}
