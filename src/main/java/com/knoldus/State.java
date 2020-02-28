package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;


/**.
 * State class defines a state of any country with list of its cities
 */

public class State {
    List<String> cities;

    /**
     * setter of list of cities of the state.
     * @param cities list of cities
     */
    public State(List<String> cities) {
        this.cities = cities;
    }

    /**
     * returns list of cities whose name starts with passed string.
     * @param s string for checking the beginning of the string
     * @return list cities which satisfy the condition
     */
    List<String> startsWith(String s) {
        return cities.stream().filter(city -> city.toLowerCase().startsWith(s)).sorted().collect(Collectors.toList());
    }
}
