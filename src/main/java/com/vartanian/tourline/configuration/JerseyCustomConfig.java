//package com.vartanian.tourline.configuration;
//
//import com.vartanian.tourline.filters.CharsetResponseFilter;
//import com.vartanian.tourline.service.PersonService;
//import com.vartanian.tourline.service.impl.PersonServiceImpl;
//import org.glassfish.hk2.utilities.binding.AbstractBinder;
//import org.glassfish.jersey.filter.LoggingFilter;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.server.ServerProperties;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import javax.ws.rs.ApplicationPath;
//import java.util.TimeZone;
//
///**
// * Created by super on 10/15/15.
// */
//@ApplicationPath(value = "/rest/")
//public class JerseyCustomConfig extends ResourceConfig {
//
//    public JerseyCustomConfig() {
//        packages("com.vartanian.tourline.controllers");
//        register(CharsetResponseFilter.class);
//        register(LoggingFilter.class);
//
//        register(new AbstractBinder() {
//            @Override
//            protected void configure() {
//                bind(PersonService.class).to(PersonService.class);
//                bind(PersonServiceImpl.class).to(PersonServiceImpl.class);
//            }
//        });
//
//        // Enable Tracing support.
//        property(ServerProperties.TRACING, "ALL");
//    }
//
//}