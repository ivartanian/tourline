package com.vartanian.tourline.repository.springdata;

import com.vartanian.tourline.models.Adress;
import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by super on 10/15/15.
 */
public interface AdressRepositoryImpl extends MongoRepository<Adress, String> {

}
