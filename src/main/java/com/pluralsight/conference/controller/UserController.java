package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Abrar") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Hayat") String lastName,
                        @RequestParam(value = "age", defaultValue = "26") int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User First Name: " + user.getFirstName() + "\n" +
                           "User Last Name: " + user.getLastName() + "\n" +
                           "User Age: " + user.getAge());
        return user;
    }
}
