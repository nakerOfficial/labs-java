package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lab1Controller {

    @GetMapping("/lab-1")
    public ResponseEntity<String> home(
            @RequestParam(value = "a", defaultValue = "") Integer a,
            @RequestParam(value = "b", defaultValue = "") String b,
            @RequestParam(value = "c", defaultValue = "") Double c
    ) {
        if (a == null)
            return new ResponseEntity<String>("Error!!! Not 'a'", HttpStatus.INTERNAL_SERVER_ERROR);

        if (b.length() == 0) {
            String x = "s-a folosit valoarea 'x'";
            b = x;
        }

        return new ResponseEntity<String>("Success lab 1!!! "
                .concat("a=" + String.valueOf(a)).concat(" ")
                .concat("b=" + String.valueOf(b)).concat(" ")
                .concat("c=" + String.valueOf(c)),
                HttpStatus.OK);
    }
}