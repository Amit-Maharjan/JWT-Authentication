package com.maharjan.amit.jwt_example.services;

import com.maharjan.amit.jwt_example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(UUID.randomUUID().toString(), "Amit Maharjan", "maharjanamit8@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Shyam Maharjan", "shyam@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Rahul Bista", "bist@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Pankaj Tripathi", "trip@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Hanu Lal", "hanu@gmail.com"));
    }

    public List<User> getUsers() {
        return users;
    }
}
