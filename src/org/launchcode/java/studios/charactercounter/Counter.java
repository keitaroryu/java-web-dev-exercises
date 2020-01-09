package org.launchcode.java.studios.charactercounter;

import java.util.HashMap;

public class Counter {
    public static HashMap<Character, Integer> counter (char[] charactersArray){
        HashMap<Character, Integer> characterCount = new HashMap<>();
        char character;
        int count;

        for(char c: charactersArray){
            if(!characterCount.containsKey(c)){
                character = c;
                count = 0;

                for(char e: charactersArray){
                    if(character==e){
                        count +=1;
                    }
                }

                characterCount.put(character, count);

            }

        }

        return characterCount;

    }
}
