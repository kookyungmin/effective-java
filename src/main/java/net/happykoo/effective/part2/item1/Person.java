package net.happykoo.effective.part2.item1;

public class Person {
    private String name;
    private String address;

    private Person() {
    }

    private Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static Person getInstance(String name, String seoul) {
        return new Person(name, seoul);
    }

    public static Person getInstanceWithName(String name) {
        Person person = new Person();
        person.name = name;

        return person;
    }

    public static Person getInstanceWithAddress(String address) {
        Person person = new Person();
        person.address = address;

        return person;
    }
}