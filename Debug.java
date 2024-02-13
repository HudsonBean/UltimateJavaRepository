public class Debug {
    public static void main(String[] args) {
       String str = "*xa*bz";
       String a = str.toLowerCase();
       // Loop through every character
       for (int i = 0; i < a.length(); i++) {
            String currentCharacter = a.substring(i, i+1);
            // Check for asterick
            if (currentCharacter.equals("*")) {
                // Asterick found; find its before and after and check
                // Before character
                if (i-1 < 0) {
                    // Out of range
                    continue;
                }
                String beforeCharacter = a.substring(i-1,i);
                // After character
                if (i+2 > a.length()) {
                    // Out of range
                    continue;
                }
                String afterCharacter = a.substring(i+1, i+2);
                // Full check
                if (beforeCharacter.equals(afterCharacter)) {
                    // Same
                    
                }
            }
       }
    }
}
