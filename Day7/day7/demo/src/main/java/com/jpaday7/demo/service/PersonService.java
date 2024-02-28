package com.jpaday7.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpaday7.demo.model.Person;
import com.jpaday7.demo.repository.PersonRepo;

@Service
public class PersonService {
    public PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }
    
    public Person posting(Person person)
    {
        return personRepo.save(person);
    }

    public List<Person> getall()
    {
        return personRepo.findAll();
    }

    public List<Person> findbyId(int id)
    {
        return personRepo.findByAge(id);
    }
}
