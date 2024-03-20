package Unit07;

import java.util.ArrayList;

public class Topic7_1IntroductionToArrayList {
    public static void main(String[] args) {
        class Person {
            private String name = "";
            public Person(String n) {
                name = n;
            }
            public void doSomething() {
                System.out.println("I " + name + " will do something!");
            }
        }
        ArrayList<Person> a = new ArrayList<>();
        a.add(new Person("Hudson"));
        a.add(new Person("James"));
        a.add(new Person("Garfield"));
        a.add(new Person("Jerry"));
        for (Person p : a) {
            p.doSomething();
        }

        ArrayList b = new ArrayList<>();
        b.add(new Person("Hello"));
        System.out.println(b);

        

    }
}
