package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        System.out.println(sumEvenNumbers(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("big");
        words.add("fast");
        words.add("array");
        words.add("sting");
        words.add("method");
        searchForWordLength(words);

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsSentence = sentence.split(" ");
        ArrayList<String> words2 = new ArrayList<>();
        for (String word: wordsSentence){
            words2.add(word);
        }
        searchForWordLength(words2);

    }

    public static Double sumEvenNumbers (ArrayList<Double> numbers){
        double sumOfEvenNumbers = 0;
        for (Double number : numbers) {
            if (number%2==0){
                sumOfEvenNumbers += number;
            }
        }
        return sumOfEvenNumbers;
    }

    public static void searchForWordLength (ArrayList<String> words){
        ArrayList<String> foundWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Length of word to search for: ");
        int wordLength = input.nextInt();

        for (String word : words) {
            if (word.length()==wordLength){
                foundWords.add(word);
            }
        }

        for (String word: foundWords){
            System.out.println(word);
        }
    }
}
