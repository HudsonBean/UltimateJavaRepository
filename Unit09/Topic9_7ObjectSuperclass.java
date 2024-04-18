package Unit09;

public class Topic9_7ObjectSuperclass {
    public static void main(String[] args) {

    }

    class a {
        public a(String d) {
            System.out.println(d);
        }

        public String test() {
            System.out.println("hello");
            return "hello";
        }
        public 
    }

    class b extends a {
        public b(String e, String f) {
            super(e);
        }

        public String test() {
            System.out.println("hello");
            return "hello";
        }
    }

    a yes = new a("a");

}
