package com.example.demo.controllers;

import com.example.demo.services.PlanetService;
import com.example.demo.types.Planet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/planets")
@RequiredArgsConstructor
public class PlanetController {
    private final PlanetService planetService;

    @GetMapping
    public List<Planet> index() {
        return planetService.indexPlanets()
                .getResults();
    }

    @GetMapping("{id}")
    public Planet planet(@PathVariable String id) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }
}
