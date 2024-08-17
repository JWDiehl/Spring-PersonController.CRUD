package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.service.PersonService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private PersonService service;

//    public PersonController(PersonService service) {
//        this.service = service;
//    }

    @PostMapping("/people/")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        //Status code = HttpStatus.CREATED - Response: 201 Created
        return new ResponseEntity<>(service.createPerson(person), HttpStatus.CREATED);
    }

    //{id} make it DyNAMIC - id of 1, id of 2.... and so on...
    @GetMapping("/people/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getPerson(id), HttpStatus.OK);
    }

    @GetMapping("/people/")
    public ResponseEntity <Iterable<Person>> getPersonList() {
        return new ResponseEntity<>(service.getPersonList(), HttpStatus.OK);
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<Person> update(@PathVariable("id") Integer id, @RequestBody Person person) {
        return new ResponseEntity<>(service.updatePerson(id, person), HttpStatus.OK);
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(service.deletePerson(id), HttpStatus.NO_CONTENT);
    }

}
