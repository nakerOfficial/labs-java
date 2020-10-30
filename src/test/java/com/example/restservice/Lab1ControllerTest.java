package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.*;

class Lab1ControllerTest {
    Lab1Controller l1;

    @BeforeEach
    void setUp() {
        l1 = new Lab1Controller();
    }

    @Test
    void home() {
        ResponseEntity<String> t1 = l1.home(null,"test", 3.4);
        Assertions.assertEquals(t1, new ResponseEntity<String>("Error!!! Not 'a'", HttpStatus.INTERNAL_SERVER_ERROR));

        ResponseEntity<String> t2 = l1.home(1,"", 3.4);
        Assertions.assertEquals(t2, new ResponseEntity<String>("Success lab 1!!! "
                .concat("a=" + String.valueOf(1)).concat(" ")
                .concat("b=" + String.valueOf("s-a folosit valoarea 'x'")).concat(" ")
                .concat("c=" + String.valueOf(3.4)),
                HttpStatus.OK));

        ResponseEntity<String> t3 = l1.home(1,"test", 3.4);
        Assertions.assertEquals(t3, new ResponseEntity<String>("Success lab 1!!! "
                .concat("a=" + String.valueOf(1)).concat(" ")
                .concat("b=" + String.valueOf("test")).concat(" ")
                .concat("c=" + String.valueOf(3.4)),
                HttpStatus.OK));
    }
}