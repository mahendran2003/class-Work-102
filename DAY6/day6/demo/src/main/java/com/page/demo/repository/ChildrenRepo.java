package com.page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.page.demo.model.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer>{

}
