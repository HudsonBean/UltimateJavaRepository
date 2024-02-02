package Unit03.Xtras;

import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your desired Discord username?\n>");

        String usrName = scanner.nextLine();

        int id = (int) ((Math.random() * (10000-1000)) + 1000);

        System.out.println("Your Discord user name is: " + usrName + "#" + id);

        scanner.close();

    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator