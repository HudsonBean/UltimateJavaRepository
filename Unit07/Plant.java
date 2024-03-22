package Unit07;

public class Plant extends Living {
    public Plant(String name) {
        super(name);
    }
    public void eat() {
        super.eat();
        System.out.println("MMM Yummy sun!");
    }
}
