package com.vartanian.tourline.controllers;

import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.PersonRepository;
import com.vartanian.tourline.repository.springdata.PersonRepositoryImpl;
import com.vartanian.tourline.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

/**
 * Created by super on 10/15/15.
 */
@Controller
public class FastlineController {

    private static final Logger LOG = LogManager.getLogger(FastlineController.class);

    @Autowired
    private MongoTemplate template;

    @GET
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView helloWorld() {

        Person p = new Person("Joe", 34);

        // Insert is used to initially store the object into the database.
//        personService.insert(p);
        LOG.info("Insert: " + p);

        // Find
//        p = personService.findOne(p.getId());
        LOG.info("Found: " + p);

        // Update
//        personService.updateFirst(query(where("name").is("Joe")), update("age", 35), Person.class);
//        p = personService.findOne(query(where("name").is("Joe")), Person.class);
        LOG.info("Updated: " + p);

        // Delete
//        personService.delete(p);

        // Check that deletion worked
//        List<Person> people =  personService.findAll();
//        LOG.info("Number of people = : " + people.size());


//        personService.dropCollection(Person.class);

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;

    }

}
