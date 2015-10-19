package com.vartanian.tourline.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.vartanian.tourline.converters.AdressReadConverter;
import com.vartanian.tourline.converters.AdressWriteConverter;
import com.vartanian.tourline.converters.PersonReadConverter;
import com.vartanian.tourline.converters.PersonWriteConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by super on 10/16/15.
 */
@Configuration
@EnableMongoRepositories(basePackages = {"com.vartanian.tourline.repository"})
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "database";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.vartanian.tourline.models";
    }

    @Override
    public CustomConversions customConversions() {
        List<Converter<?, ?>> converterList = new ArrayList<Converter<?, ?>>();
        converterList.add(new PersonReadConverter());
        converterList.add(new PersonWriteConverter());
        converterList.add(new AdressWriteConverter());
        converterList.add(new AdressReadConverter());
        return new CustomConversions(converterList);
    }
}
