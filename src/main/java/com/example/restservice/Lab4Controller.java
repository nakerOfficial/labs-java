package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/abc")
public class Lab4Controller {

    @GetMapping("/a")
    public ResponseEntity<String> a(Model model) {
        return new ResponseEntity<String>("Success lab 4!!! /abc/a", HttpStatus.OK);
    }

    @GetMapping("/b")
    public ResponseEntity<String> b(Model model) {
        return new ResponseEntity<String>("Success lab 4!!! /abc/a", HttpStatus.OK);
    }
}
