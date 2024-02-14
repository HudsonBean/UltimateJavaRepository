public class Debug {
    public static void main(String[] args) {
       String str = "*stringy";
        String a = str.toLowerCase();
        String result = "";
        boolean doLast = true;
        for (int i = 0; i < str.length(); i++) {
            // Loop through every character
            // Check if it's a star
            String currentCharacter = a.substring(i, i+1);
            if (currentCharacter.equals("*")) {
                // Is a star
                if (i == 0) {
                    // First index
                    // No left character
                    // Move iterator to the next section
                    System.err.println("Star is first");
                    i = 2;
                }
                // Check if last?
                if (i == a.length()) {
                    // Last index
                    // No right character
                    // However there is still a right
                    // Remove before letter since it's already in the result
                    System.err.println("Star is last");
                    result = result.substring(0, result.length()-1);
                    break;
                }
                // Remove last since it's already in
                // Check if last exists
                if (result.length()-1 < 0) {
                    // Out of range
                    continue;
                }
                if (doLast) {
                    result = result.substring(0, result.length()-1);
                }
                // Now let's check if right is also a star
                // Check if next exists
                if (i+2 > a.length()) {
                    // Out of range
                    break;
                }
                if (a.substring(i+1, i+2).equals("*")) {
                    // Next is also star so we'll handle that on next loop
                    doLast = false;
                    continue;
                } else {
                    // Skip next character
                    i++;
                }
            } else {
                doLast = true;
                result += currentCharacter;
            }
        }
        System.out.println(result);
    }
}
