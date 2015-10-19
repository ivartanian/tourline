package com.vartanian.tourline.converters;

import com.mongodb.DBObject;
import com.vartanian.tourline.models.Adress;
import com.vartanian.tourline.models.Person;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.util.List;

/**
 * Created by super on 10/19/15.
 */
@ReadingConverter
public class PersonReadConverter implements Converter<DBObject, Person> {

    public Person convert(DBObject source) {
        Person p = new Person((String) source.get("name"), (int) source.get("age"), (List<Adress>) source.get("adresses"));
        p.setId((ObjectId) source.get("_id"));
        return p;
    }
}

