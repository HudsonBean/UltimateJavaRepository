package Unit03.Xtras;

import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input some text:");
        scanner.useDelimiter("\\Z");
        String textLines = scanner.next();
        String firstWord = textLines.substring(0, (textLines.indexOf(" ")));
        String firstSentence = textLines.substring(0, textLines.indexOf(".")+1);


        System.out.println("Here's some info on your text!\n    Letter count: " + textLines.length() + "\n   First word: '" + firstWord + "'\n   First sentence: '" + firstSentence + "'");

    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
