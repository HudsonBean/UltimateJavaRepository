package Unit07;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic7_2ArrayListMethods {
    public static void main(String[] args) {
        // ArrayList<Person> a = new ArrayList<>();

        // a.add(new Person("alice"));
        // a.add(new Person("bob"));
        // a.add(new Person("clara"));

        Person[] a2 = {new Person("alice"), new Person("bob"), new Person("clara")};
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

    }

}
