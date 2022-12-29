package io.github.mavaze.bookmyshow.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mavaze.bookmyshow.contract.admin.TheaterApi;

@RestController
public class TheaterController implements TheaterApi {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
