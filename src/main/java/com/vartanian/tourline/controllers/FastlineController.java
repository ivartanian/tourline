package com.vartanian.tourline.controllers;

import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.TimeZone;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

/**
 * Created by super on 10/15/15.
 */
@Component
@Controller
@Path("/")
public class FastlineController {

    private static final Logger LOG = LogManager.getLogger(FastlineController.class);

    @Autowired
    private PersonService personService;

    @GET
    @Transactional
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response helloWorld() {

        Person p = new Person("Joe", 34);

//        // Insert is used to initially store the object into the database.
//        mongoOps.insert(p);
//        LOG.info("Insert: " + p);
//
//        // Find
//        p = mongoOps.findById(p.getId(), Person.class);
//        LOG.info("Found: " + p);
//
//        // Update
//        mongoOps.updateFirst(query(where("name").is("Joe")), update("age", 35), Person.class);
//        p = mongoOps.findOne(query(where("name").is("Joe")), Person.class);
//        LOG.info("Updated: " + p);
//
//        // Delete
//        mongoOps.remove(p);
//
//        // Check that deletion worked
//        List<Person> people =  mongoOps.findAll(Person.class);
//        LOG.info("Number of people = : " + people.size());
//
//
//        mongoOps.dropCollection(Person.class);

        LOG.debug(MarkerManager.getMarker("debug message"), "correct code");

        return Response.status(200).entity("Hello world!!!").build();

    }

}
