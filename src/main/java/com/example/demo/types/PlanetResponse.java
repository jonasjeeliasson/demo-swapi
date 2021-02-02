package com.example.demo.types;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.List;

@Builder
@With
@Value
public class PlanetResponse {
    private final Integer count;
    private final List<Planet> results;
}
