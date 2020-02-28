package com.knoldus;

/**
 * Defines User with name, id, age and address.
 */

public class User {
    Integer id;
    String name;
    int age;
    String address;

    public User(Integer id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", age=" + age
                + ", address='" + address + '\''
                + '}';
    }
}
