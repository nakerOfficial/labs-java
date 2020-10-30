package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lab2Controller {

    @GetMapping("/lab-2-a{a}-b{b}-c{c}")
    public ResponseEntity<String> home(
            @PathVariable(value = "a") Integer a,
            @PathVariable(value = "b") String b,
            @PathVariable(value = "c") Double c,
            Model model
    ) {
        if (a == null)
            return new ResponseEntity<String>("Error!!! Not 'a'", HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<String>("Success lab 2!!! "
                .concat("a=" + String.valueOf(a)).concat(" ")
                .concat("b=" + String.valueOf(b)).concat(" ")
                .concat("c=" + String.valueOf(c)),
                HttpStatus.OK);
    }
}
