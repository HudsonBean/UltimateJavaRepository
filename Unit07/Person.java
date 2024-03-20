package Unit07;

public class Person implements Comparable<Person> {
    private int age;
    private String name;
    public Person(String name) {
        this.name = name;
        this.age = (int) (Math.random() * 100);
    }

    public String toString() {
        return this.name + "(" + this.age + ")";
    }

    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
