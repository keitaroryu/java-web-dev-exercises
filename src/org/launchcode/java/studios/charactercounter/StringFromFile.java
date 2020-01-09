package org.launchcode.java.studios.charactercounter;

import java.io.File;
import java.util.Scanner;

public class StringFromFile {
    public static String main () throws Exception {
        String stringFromFile = "";
        File file = new File("C:\\Users\\keita\\Desktop\\String.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            stringFromFile += sc.nextLine();
        }

        sc.close();
        return stringFromFile;
    }

}
