//package com.vartanian.tourline.converters;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.DBObject;
//import com.vartanian.tourline.models.Address;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.convert.WritingConverter;
//
///**
// * Created by super on 10/19/15.
// */
//@WritingConverter
//public class AdressWriteConverter implements Converter<Address, DBObject> {
//
//    public DBObject convert(Address source) {
//        DBObject dbo = new BasicDBObject();
//        dbo.put("_id", source.getId());
//        dbo.put("street", source.getStreet());
//        dbo.put("country", source.getCountry());
//        return dbo;
//    }
//}
//
