package com.curd.service;

import com.curd.model.User;
import com.curd.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User create(User user){
        User save =this.userRepo.save(user);
        return save;
    }
    public List<User> allUser(){
        return userRepo.findAll();
    }
}
