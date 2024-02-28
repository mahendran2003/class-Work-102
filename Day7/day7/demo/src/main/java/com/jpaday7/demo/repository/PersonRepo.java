package com.jpaday7.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaday7.demo.model.Person;
import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>
{
    List<Person> findByAge(int age);
}
