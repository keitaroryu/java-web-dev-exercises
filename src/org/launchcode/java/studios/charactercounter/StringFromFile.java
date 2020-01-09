package org.launchcode.java.studios.charactercounter;

import java.io.File;
import java.util.Scanner;

public class StringFromFile {
    public static String main () throws Exception {
        String stringFromFile = "";
        File file = new File("C:\\Users\\keita\\Documents\\LC101\\java-practice\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\charactercounter\\String.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            stringFromFile += sc.nextLine();
        }

        sc.close();
        return stringFromFile;
    }

}
