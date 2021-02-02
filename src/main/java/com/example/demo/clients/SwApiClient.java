package com.example.demo.clients;

import com.example.demo.types.PlanetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class SwApiClient {
    private final RestTemplate restTemplate;

    public PlanetResponse indexPlanets() {
        return restTemplate.getForObject("https://swapi.dev/api/planets/", PlanetResponse.class);
    }
}
