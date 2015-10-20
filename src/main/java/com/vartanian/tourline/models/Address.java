package com.vartanian.tourline.models;

import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by super on 10/15/15.
 */
@Document(collection="address")
public class Address implements Serializable {

    @Id
    private String id;
    private String street;
    private String country;

    public Address(String street, String country) {
        this.street = street;
        this.country = country;
    }

    public Address() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

