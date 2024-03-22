package Unit07;
// Imports

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Roof!");
    }
}