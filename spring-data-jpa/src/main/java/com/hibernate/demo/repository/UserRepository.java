package com.hibernate.demo.repository;

import java.util.List;

import com.hibernate.demo.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findAll();
}