package com.example.restservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class Lab3ControllerTest {
    Lab3Controller l3;

    @BeforeEach
    void setUp() {
        l3 = new Lab3Controller();
    }

    @Test
    void home() {
        ResponseEntity<String> t1 = l3.home(502);
        Assertions.assertEquals(t1, new ResponseEntity<String>("Error!!! Not 'a'", HttpStatus.BAD_GATEWAY));

        ResponseEntity<String> t2 = l3.home(1);
        Assertions.assertEquals(t2, new ResponseEntity<String>("Success lab 3!!!", HttpStatus.OK));
    }
}