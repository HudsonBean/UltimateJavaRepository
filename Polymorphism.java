import Unit07.Dog;
import Unit07.Plant;

public class Polymorphism {
    public static void main(String[] args) {
        Dog snowBall = new Dog("Snowball");
        Plant daisy = new Plant("Daisy");
        snowBall.eat();
        System.out.println(snowBall);
        daisy.eat();
        System.out.println(daisy);
        daisy.die();
        System.out.println(daisy);
    }
}
