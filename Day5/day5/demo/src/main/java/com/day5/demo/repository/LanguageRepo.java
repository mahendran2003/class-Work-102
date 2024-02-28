package com.day5.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.demo.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>
{
    
}