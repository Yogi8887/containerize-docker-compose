package com.curd.controller;

import com.curd.model.User;
import com.curd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> allUser(){
        return new ResponseEntity<>(userService.allUser(),HttpStatus.OK);
    }

}
