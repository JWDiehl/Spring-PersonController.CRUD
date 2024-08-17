package io.zipcoder.crudapp.service;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service //tell Spring this class is going to be a service class
//Service class handles BUSINESS logic for your application
public class PersonService {

    private PersonRepository repository;


}
