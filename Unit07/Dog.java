package Unit07;
// Imports
import Unit07.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println("Roof!");
    }
}