package com.hibernate.demo.controller;

import java.util.List;

import com.hibernate.demo.model.User;
import com.hibernate.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity <List<User>> getUserList() {
        return ResponseEntity.ok().body(userService.getUserList());
    }
}