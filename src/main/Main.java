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
        q.address.city = "Kiev";

        int[] a;
        a = new int[5];

        int b[] = new int[3];

        double[][] x;

        Person[] persons = new Person[5];
        persons[0] = p;
        persons[1] = q;
        persons[2] = new Person("Sidorov");
//        persons[2].address = new Address();
        persons[2].address.city = "Odessa";

        persons[3] = new Person("Titov");
        persons[4] = new Person("Petrenko");

        for (int i=0; i<persons.length; i++) {
            System.out.println(persons[i].fio);
        }
        System.out.println("-------------");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
