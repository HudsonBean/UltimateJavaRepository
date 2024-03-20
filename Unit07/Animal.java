package Unit07;

public class Animal {
    private int age = (int) ((Math.random()*100)+1);
    private String name;
    private double health = 100.0;
    public Animal (String name) {
        this.name = name;
    }

    // Methods
    public void eat() {
        System.out.println("Crunch!");
    }
    public void die() {
        System.out.println("Ow!");
        this.health = 0;
    }
    public void takeDamage(double damage) {
        this.health-=damage;
    }
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.name + " " + this.age + " - " + this.health;
    }
}
