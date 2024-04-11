package Unit09;

public class Topic9_1CreatingSuperclassesAndSubclasses {

    public static void main(String[] args) {
        class test {
            private String name;

            public test(String n) {
                setName(n);
            }

            public void setName(String n) {
                name = n;
            }

            public String getName() {
                return name;
            }
        }

        class newTest extends test {
            public newTest(String n) {
                super(n);
            }

            public void sayHi() {
                System.out.println("Hello!");
            }

            public String getName() {
                return "HellO!";
            }
        }

        test a = new newTest("Yes");

        System.out.println(a.getName());
    }
}
