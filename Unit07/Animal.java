package Unit07;


public class Animal extends Living {
    public Animal (String name) {
        super(name);
    }
    public void makeNoise() {
        System.err.println("Hi!");
    }
}
