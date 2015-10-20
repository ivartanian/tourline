//package com.vartanian.tourline.converters;
//
//import com.mongodb.DBObject;
//import com.vartanian.tourline.models.Address;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.convert.ReadingConverter;
//
///**
// * Created by super on 10/19/15.
// */
//@ReadingConverter
//public class AdressReadConverter implements Converter<DBObject, Address> {
//
//    public Address convert(DBObject source) {
//        Address address = new Address((String) source.get("street"), (String) source.get("country"));
//        address.setId(source.get("_id").toString());
//        return address;
//    }
//}
//
