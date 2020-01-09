package org.launchcode.java.studios.charactercounter;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main (String[] args) throws Exception {
//        String inputString = "If the product of two terms is zero then common sense says at least "
//        +"one of the two terms has to be zero to start with. So if you move all the terms over to "
//        +"one side, you can put the quadratics into a form that can be factored allowing that side "
//        +"of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        String inputString;
        System.out.println("Welcome to Character Counter!");
        System.out.print("Would you like to load from file? (Y/N): ");
        String response = input.next();

        while (!response.matches("[yYnN]")){
            System.out.print("Not a valid selection! Would you like to load from file? (Y/N): ");
            response = input.nextLine();
        }

        if (response.equals("y") || response.equals("Y")) {
            inputString = StringFromFile.main();
        } else {
            input.nextLine(); //Consumes the enter input from above allowing the nextLine() below to que for response.
            System.out.println("Enter phrase for character counter: ");
            inputString = input.nextLine().toLowerCase();
            input.close();
        }

        char[] charactersInString = RemoveNonAlphabetic.removeNonAlphabetic(inputString).toCharArray();
        HashMap<Character, Integer> characterCount = Counter.counter(charactersInString);

        for(Map.Entry<Character, Integer> character: characterCount.entrySet()){
            System.out.println(character.getKey()+": "+character.getValue());
        }

    }
}
