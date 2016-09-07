package main;

/**
 * Created by Eugeny on 07.09.2016.
 */
public class Person {
    String fio;
    int age;
    Address address;

    Person(String fio) {
        this.fio = fio;
        address = new Address();
    }
}
