package com.hishan.webapplications.webapplication1.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public String index() {
        return "Welcome to student API";
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<String> getRole(@PathVariable("id") String id) {
        return new ResponseEntity<>("Hishan Indrajith : " + id, HttpStatus.OK);
    }
}
