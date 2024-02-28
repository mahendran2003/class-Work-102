package com.jpaday7.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpaday7.demo.model.Person;
import com.jpaday7.demo.service.PersonService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PersonController{
    public PersonService personService;
    
    
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<Person> poting(@RequestBody Person person)
    {
        Person obj=personService.posting(person);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getting()
    {
        List<Person> obj2=personService.getall();
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<Person>> getbyid(@RequestParam int byAge)
    {
        List<Person> obj3=personService.findbyId(byAge);
        if(obj3==null)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }
}
