package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    public static boolean endsLy(String str) {
        String temp = str.substring(str.length()-2, str.length());
    
        return temp.equals("ly");
    }

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public static String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n, str.length());
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String middleTwo(String str) {
        return str.substring(((str.length()/2)-1), ((str.length()/2)+1));
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
    }
}
