package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("???")
public class PlanetResidentController {

    @GetMapping
    public List<Object> index() {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }
}
