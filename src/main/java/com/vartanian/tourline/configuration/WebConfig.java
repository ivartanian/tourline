package com.vartanian.tourline.configuration;

import com.mongodb.MongoClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.net.UnknownHostException;
import java.util.TimeZone;

/**
 * Created by super on 10/15/15.
 */
@Configuration
@EnableWebMvc
@EnableJpaRepositories("com.vartanian.tourline.repository")
@EnableTransactionManagement
@ComponentScan(value = {"com.vartanian.tourline"})
@PropertySource("classpath:data-access.properties")
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final Logger LOG = LogManager.getLogger(WebConfig.class);

    @Autowired
    Environment environment;

    @Bean
    public TimeZone timeZone() {
        return TimeZone.getTimeZone("Europe/Kiev");
    }

    @Bean
    public MongoClient mongo() throws UnknownHostException {
        LOG.debug(MarkerManager.getMarker("MongoClient"), "MongoClient will be create");
        try {
            return new MongoClient(environment.getProperty("jdbc.host"), Integer.valueOf(environment.getProperty("jdbc.port")));
        } catch (UnknownHostException e) {
            LOG.error(MarkerManager.getMarker("MongoClient"), "MongoClient create fail", e);
            throw e;
        }
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
        LOG.debug(MarkerManager.getMarker("MongoDbFactory"), "MongoDbFactory will be create");
        try {
            return new SimpleMongoDbFactory(mongo(), "users");
        } catch (UnknownHostException e) {
            LOG.error(MarkerManager.getMarker("MongoDbFactory"), "MongoDbFactory create fail");
            throw e;
        }
    }

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {
        LOG.debug(MarkerManager.getMarker("MongoTemplate"), "MongoTemplate will be create");
        try {
            return new MongoTemplate(mongoDbFactory());
        } catch (UnknownHostException e) {
            LOG.error(MarkerManager.getMarker("MongoTemplate"), "MongoTemplate create fail");
            throw  e;
        }
    }

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