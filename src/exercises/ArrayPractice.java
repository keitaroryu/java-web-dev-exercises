package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args){
        int[] numberSet = { 1, 1, 2, 3, 5, 8};

        for (int i :numberSet ) {
            System.out.println(i);
        }

        for (int i :numberSet ) {
            if (!(i%2 == 0)) {
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));

        String[] sentenceArray2 = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray2));
    }
}
