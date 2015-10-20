//package com.vartanian.tourline.converters;
//
//import com.mongodb.DBObject;
//import com.vartanian.tourline.models.Address;
//import com.vartanian.tourline.models.Person;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.convert.ReadingConverter;
//
//import java.util.List;
//
///**
// * Created by super on 10/19/15.
// */
//@ReadingConverter
//public class PersonReadConverter implements Converter<DBObject, Person> {
//
//    public Person convert(DBObject source) {
//        Person p = new Person((String) source.get("name"), (int) source.get("age"), (List<Address>) source.get("adresses"));
//        p.setId(source.get("_id").toString());
//        return p;
//    }
//}
//
