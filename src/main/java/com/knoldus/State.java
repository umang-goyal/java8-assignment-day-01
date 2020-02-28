package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class State {
    List<String> cities;

    public State(List<String> cities) {
        this.cities = cities;
    }

    List<String> startsWith(String s) {
        return cities.stream().filter(city -> city.startsWith(s)).sorted().collect(Collectors.toList());
    }
}
