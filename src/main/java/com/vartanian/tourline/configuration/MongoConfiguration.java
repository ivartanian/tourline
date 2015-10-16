package com.vartanian.tourline.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

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


}
