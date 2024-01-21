package Unit02.Topic2_2;

public class Thing {
    public Thing() {

    }
    public void talk() {
        System.out.print("Hello ");
    }
    public void name() {
        System.out.print("my friend");
    }
    public void greet() {
        talk();
        name();
    }
    public static void main(String[] args) {
        Thing a = new Thing();
        a.talk();
        a.greet();
    }
}
