package com.lessons.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> home()
    {
        Map<String, String> response = new HashMap<>();
        response.put("status", "ok");

        return response;
    }

}
