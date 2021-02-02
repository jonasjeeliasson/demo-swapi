package com.example.demo.services;

import com.example.demo.clients.SwApiClient;
import com.example.demo.types.PlanetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanetService {
    private final SwApiClient swApiClient;

    public PlanetResponse indexPlanets() {
        return swApiClient.indexPlanets();
    }
}
