package io.zipcoder.crudapp.service;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //tell Spring this class is going to be a service class
//Service class handles BUSINESS logic for your application
public class PersonService {

    private PersonRepository repository;

    public Person createPerson(Person person) {
        return repository.save(person);
    }

    public Person getPerson(Integer id) {
        return repository.findOne(id);
    }

    public Iterable<Person> getPersonList() {
        return repository.findAll();
    }

    public Person updatePerson(Integer id, Person person) {
        Person person1 = repository.findOne(id);
        person1.setFirstName(person.getFirstName());
        person1.setLastName(person.getLastName());
        return repository.save(person1);
    }

    public boolean deletePerson(Integer id) {
        repository.delete(id);
        return true;
    }
}
