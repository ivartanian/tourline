package com.vartanian.tourline.repository.springdata;

import com.vartanian.tourline.models.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by super on 10/15/15.
 */
public interface AdressRepositoryImpl extends MongoRepository<Address, String> {

}
