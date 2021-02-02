package com.example.demo.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.List;

@Builder
@With
@Value
public class Planet {
    private final String climate;
    private final String diameter;
    private final String gravity;
    private final String name;

    @JsonProperty("orbital_period")
    private final String orbitalPeriod;
    private final String population;
    private final List<String> residents;

    @JsonProperty("rotation_period")
    private final String rotationPeriod;

    @JsonProperty("surface_water")
    private final String surfaceWater;
    private final String terrain;
    private final String url;
}
