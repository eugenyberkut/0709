package main;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Person p = new Person("Ivanov");
        p.age = 25;
//        p.fio = "Ivanov";
//        p.address = new Address();
        p.address.city = "Nikolaev";

        Person q = new Person("Petrov");
        q.age = 30;
//        q.fio = "Petrov";
//        q.address = new Address();
        q.address.city = "Kiev";

        int[] a;
        a = new int[5];

        int b[] = new int[3];

        double[][] x;

        Person[] persons = new Person[3];
        persons[0] = p;
        persons[1] = q;
        persons[2] = new Person("Sidorov");
//        persons[2].address = new Address();
        persons[2].address.city = "Odessa";
    }
}
