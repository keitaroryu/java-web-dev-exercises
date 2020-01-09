package org.launchcode.java.studios.charactercounter;

public class RemoveNonAlphabetic {
    public static String removeNonAlphabetic(String inputString){
        //Test regex
        //System.out.print(inputString.replaceAll("[^a-zA-Z]", ""));
        return inputString.replaceAll("[^a-zA-Z]", "");
    }
}
