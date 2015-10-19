package com.vartanian.tourline.controllers;

import com.vartanian.tourline.models.Adress;
import com.vartanian.tourline.models.Person;
import com.vartanian.tourline.repository.springdata.AdressRepositoryImpl;
import com.vartanian.tourline.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import java.util.Arrays;
import java.util.List;

/**
 * Created by super on 10/15/15.
 */
@Controller
public class FastlineController {

    private static final Logger LOG = LogManager.getLogger(FastlineController.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private AdressRepositoryImpl adressRepository;

    @GET
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView helloWorld() {

        List<Adress> adresses = Arrays.asList(new Adress("Kuchera", "Ukraine"), new Adress("Mira", "Ukraine"));
        adressRepository.insert(adresses);
        Person p = new Person("Joe", 34, adresses);

        // Insert is used to initially store the object into the database.
        personService.insert(p);
        LOG.info("Insert: " + p);

        // Find
        p = personService.findByName("Joe");
        LOG.info("Found: " + p);

        // Delete
        adressRepository.delete(adresses);

        // Delete
        personService.delete(p);
        LOG.info("Delete: " + p);

        // Check that deletion worked
        List<Person> people =  personService.findAll();
        LOG.info("Number of people = : " + people.size());

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;

    }

}
