package com.vartanian.tourline.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.net.UnknownHostException;

/**
 * Created by super on 10/15/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan(value = {"com.vartanian.tourline"})
@PropertySource("classpath:data-access.properties")
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final Logger LOG = LogManager.getLogger(WebConfig.class);

    @Autowired
    Environment environment;

//    @Bean
//    public Mongo mongoTamplate() throws UnknownHostException {
//        return new Mongo("localhost");
//    }
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throws Exception {
//        return new SimpleMongoDbFactory(new Mongo(), "database");
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        return new MongoTemplate(mongoDbFactory());
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/jsp/**").addResourceLocations("/jsp/");
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
        registry.beanName();
    }

}