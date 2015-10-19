package com.vartanian.tourline.models;

import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by super on 10/15/15.
 */
@Document(collection="adress")
public class Adress extends BasicDBObject implements Serializable {

    @Id
    private ObjectId id;
    private String street;
    private String country;

    public Adress(String street, String country) {
        this.street = street;
        this.country = country;
    }

    public Adress() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

