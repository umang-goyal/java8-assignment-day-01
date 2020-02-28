package com.knoldus;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Utilities obj = new Utilities();
        System.out.println(obj.perimeterOfPentagon());

        List<String> citiesOfGoa = Arrays.asList("Calangute", "Canacona", "Calangute", "panchim");

        State goa = new State(citiesOfGoa);
        System.out.println(goa.startsWith("c"));

        User jagan = new User(78, "jagan", 56, "Delhi");
        User shambu = new User(2, "shambu", 22, "Delhi");
        User reshma = new User(11, "reshma", 18, "Delhi");
        User savita = new User(8, "savita", 34, "pune");

        List<User> userList = Arrays.asList(jagan, shambu, reshma, savita);

        System.out.println(obj.age18AddressDelhi(userList));
        System.out.println(obj.ageAbove18andDelhi(userList));
        System.out.println(obj.ageEven(userList));
        System.out.println(obj.idAbove10AgeLessThan20(userList));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 9, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

        try {
            System.out.println(obj.mapLists(list1, list2));
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
    }
}
