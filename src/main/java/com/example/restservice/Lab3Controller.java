package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Lab3Controller {

    @GetMapping("/lab-3/{a}")
    public ResponseEntity<String> home(
            @PathVariable(value = "a") Integer a
    ) {
        if (a == 502)
            return new ResponseEntity<String>("Error!!! Not 'a'", HttpStatus.BAD_GATEWAY);

        return new ResponseEntity<String>("Success lab 3!!!", HttpStatus.OK);
    }
}
