package Unit04;

public class StringLoops {

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString+=str.charAt(i);
            newString+=str.charAt(i);
        }
        return newString;
    }

    public static int countCode(String str) {
        String a = str.toLowerCase();
        int count = 0;

        for (int i = 0; i<a.length(); i++) {
            // Check if current letter is a c followed by an o
            
            if (a.substring(i,i+1).equals("c")) {
                // Is a c
                // Is next o?
                if (i+2 < a.length() && a.substring(i+1,i+2).equals("o")) {
                    // Bug fix: Won't exceed range
                    // Is a o
                    // Skip the 3rd letter and check for e
                    if(i+3 < a.length() && a.substring(i+3,i+4).equals("e")) {
                        // Bug fix: Won't exceed range
                        // It is this is code
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        String a = str.toLowerCase();

        // Loop characters
        for (int i = 0; i < a.length(); i++) {
            // Check for b
            if (i+1 < a.length() && a.substring(i, i+1).equals("b")) {
                // Character is b
                // Skip next and check for another b
                if (i+3 <= a.length() && a.substring(i+2, i+3).equals("b")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        String a = str.toLowerCase();

        // Get prefix
        String prefix = a.substring(0, n);
        int prefixIterator = 0;
        // Loop through characters to check if it exists again
        for (int i = n; i <= a.length(); i++) {
            if (i+1 <= a.length()) {
                // Keep i in range
                if (prefixIterator+1 <= a.length()) {
                    // keep prefixIterator in range
                    String currentLetterInWord = a.substring(i, i+1);
                    System.out.println(prefixIterator);
                    String currentPrefixLetter = prefix.substring(prefixIterator, prefixIterator+1);
                    // Check if same
                    if (currentLetterInWord.equals(currentPrefixLetter)) {
                        // They are same go to next
                        // Check if prefix is at it's max if so then there is a word
                        prefixIterator++;
                        if (prefixIterator==n) {
                            // At the end return true
                            prefixIterator = 0;
                            return true;
                        }
                    } else {
                        // Reset prefix
                        prefixIterator = 0;
                    }
                }
            }
        }
        return false;
    }

    public static boolean sameStarChar(String str) {
        return false;
    }

    public static String starOut(String str) {
        return "";
    }

    public static int countHi(String str) {
        return 0;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }
}
