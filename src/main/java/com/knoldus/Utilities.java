package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utilities {

    /**.
     * implements the abstract method of Pentagon interface to calculate perimeter of a pentagon
     * @return length of the pentagon perimeter
     */

    int perimeterOfPentagon() {
        Pentagon shape = (side1, side2, side3, side4, side5) -> side1 + side2 + side3 + side4 + side5;
        return shape.configuration(1, 2, 3, 4, 5);
    }

    /**.
     * takes list of Users type and finds User who have age above 18 and address delhi
     * @param list List of User type
     * @return list of User type who satisfy the condition
     */

    List<User> ageAbove18andDelhi(List<User> list) {
        return list.stream()
                .filter(user -> user.age > 18 && user.address.toLowerCase().equals("delhi"))
                .collect(Collectors.toList());
    }

    /**.
     * checks if a User has id above 10 and age less than 20
     * @param list List of User type
     * @return list of User type who satisfy the condition
     */

    List<User> idAbove10AgeLessThan20(List<User> list) {
        return list.stream()
                .filter(user -> user.id > 10 && user.age < 20)
                .collect(Collectors.toList());
    }

    /**.
     * checks if a User age is a even number
     * @param list List of User type
     * @return list of User type who satisfy the condition
     */

    List<User> ageEven(List<User> list) {
        return list.stream()
                .filter(user -> user.age % 2 == 0)
                .collect(Collectors.toList());
    }

    /**.
     * checks if a User has id above 10 and age less than 20
     * @param list List of User type
     * @return list of User type who satisfy the condition
     */

    List<User> age18AddressDelhi(List<User> list) {
        return list.stream()
                .filter(user -> user.age == 18 && user.address.toLowerCase()
                        .equals("delhi"))
                .collect(Collectors.toList());
    }

    /**.
     * multiplies corresponding elements of two list
     * @param first first list of integer
     * @param second second list integer
     * @return list with elements as product of input list elem
     * @throws MappingListException throws exception if size of lists are not equal
     */

    List<Integer> mapLists(List<Integer> first, List<Integer> second) throws MappingListException {
        if (first.size() != second.size()) {
            throw new MappingListException("List size not equal");
        } else {
            return IntStream.range(0, first.size())
                    .map(index -> first.get(index) * second.get(index))
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}
