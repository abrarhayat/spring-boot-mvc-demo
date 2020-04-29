package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping(value = "registration")
    public String getRegistration(Map<String, Object> model) {
        model.put("message", "This is from the registration controller");
        return "registration";
    }
}
