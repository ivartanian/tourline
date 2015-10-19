package com.vartanian.tourline.converters;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.vartanian.tourline.models.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

/**
 * Created by super on 10/19/15.
 */
@WritingConverter
public class PersonWriteConverter implements Converter<Person, DBObject> {

    public DBObject convert(Person source) {
        DBObject dbo = new BasicDBObject();
        dbo.put("_id", source.getId());
        dbo.put("name", source.getName());
        dbo.put("age", source.getAge());
        dbo.put("adresses", source.getAdresses());
        return dbo;
    }
}

