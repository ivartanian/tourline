//package com.vartanian.tourline.controllers;
//
//import com.vartanian.tourline.models.Person;
//import com.vartanian.tourline.service.PersonService;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.MarkerManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.inject.Inject;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Response;
//import java.util.List;
//
///**
// * Created by super on 10/15/15.
// */
//@Component
//@Path("/")
//public class TourlineController {
//
//    private static final Logger LOG = LogManager.getLogger(TourlineController.class);
//
//    @Autowired
//    private PersonService personService;
//
//    @GET
//    public Response helloWorld() {
//
//        Person p = new Person("Joe", 34);
//
//        // Insert is used to initially store the object into the database.
//        personService.insert(p);
//        LOG.info("Insert: " + p);
//
//        // Find
//        p = personService.findByName("Joe");
//        LOG.info("Found: " + p);
//
//        // Delete
//        personService.delete(p);
//        LOG.info("Delete: " + p);
//
//        // Check that deletion worked
//        List<Person> people =  personService.findAll();
//        LOG.info("Number of people = : " + people.size());
//
//        return Response.status(200).entity("Hello world!!!").build();
//
//    }
//
//}
