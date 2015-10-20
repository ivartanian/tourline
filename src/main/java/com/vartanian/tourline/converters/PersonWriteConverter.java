//package com.vartanian.tourline.converters;
//
//import com.mongodb.BasicDBList;
//import com.mongodb.BasicDBObject;
//import com.mongodb.DBObject;
//import com.vartanian.tourline.models.Address;
//import com.vartanian.tourline.models.Person;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.convert.WritingConverter;
//
//import java.util.List;
//
///**
// * Created by super on 10/19/15.
// */
//@WritingConverter
//public class PersonWriteConverter implements Converter<Person, DBObject> {
//
//    public DBObject convert(Person source) {
//        DBObject dbo = new BasicDBObject();
//        dbo.put("_id", source.getId());
//        dbo.put("name", source.getName());
//        dbo.put("age", source.getAge());
//        BasicDBList objects = new BasicDBList();
//        List<Address> addresses = source.getAddresses();
//        for (Address address : addresses) {
//            BasicDBObject basicDBObject = new BasicDBObject();
//            basicDBObject.put("_id", address.getId());
//            basicDBObject.put("street", address.getStreet());
//            basicDBObject.put("country", address.getCountry());
//            objects.add(basicDBObject);
//        }
//        dbo.put("adresses", objects);
//        return dbo;
//    }
//}
//
