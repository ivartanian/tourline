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
public class AdressReadConverter implements Converter<DBObject, Adress> {

    public Adress convert(DBObject source) {
        Adress adress = new Adress((String) source.get("street"), (String) source.get("country"));
        adress.setId((ObjectId) source.get("_id"));
        return adress;
    }
}

