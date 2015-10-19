package com.vartanian.tourline.converters;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.vartanian.tourline.models.Adress;
import com.vartanian.tourline.models.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

/**
 * Created by super on 10/19/15.
 */
@WritingConverter
public class AdressWriteConverter implements Converter<Adress, DBObject> {

    public DBObject convert(Adress source) {
        DBObject dbo = new BasicDBObject();
        dbo.put("_id", source.getId());
        dbo.put("street", source.getStreet());
        dbo.put("country", source.getCountry());
        return dbo;
    }
}

