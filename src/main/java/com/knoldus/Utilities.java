package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utilities {
    int perimeter() {
        Pentagon shape = (a, b, c, d, e) -> a + b + c + d + e;
        return shape.perimeter(1, 2, 3, 4, 5);
    }

    List<User> ageAbove18andDelhi(List<User> list) {
        return list.stream()
                .filter(user -> user.age > 18 && user.address.equals("Delhi"))
                .collect(Collectors.toList());
    }

    List<User> idAbove10AgeLessThan20(List<User> list) {
        return list.stream()
                .filter(user -> user.id > 10 && user.age < 20)
                .collect(Collectors.toList());
    }

    List<User> ageEven(List<User> list) {
        return list.stream()
                .filter(user -> user.age % 2 == 0)
                .collect(Collectors.toList());
    }

    List<User> age18AddressDelhi(List<User> list) {
        return list.stream()
                .filter(user -> user.age == 18 && user.address.toLowerCase()
                .equals("Delhi".toLowerCase()))
                .collect(Collectors.toList());
    }

    List<Integer> mapLists(List<Integer> first, List<Integer> second) {

        return IntStream.range(0, first.size())
                .map(index -> first.get(index) * second.get(index))
                .boxed()
                .collect(Collectors.toList());
    }

}
