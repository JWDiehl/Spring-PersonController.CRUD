package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @PostMapping
    public Person createPerson(Person person) {
        return person;

    }

}
