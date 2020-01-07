package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args){
        String alice = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        String aliceWordRemoved;

        Scanner input = new Scanner(System.in);
        System.out.println("Search word for the first sentence in Alice's Adventure in Wonderland: ");
        String searchWord = input.next();
        input.close();

        if(alice.toLowerCase().contains(searchWord.toLowerCase())){
            System.out.println("The word was found.");
            System.out.println("The index of the word in the sentence is " +
                    +alice.toLowerCase().indexOf(searchWord.toLowerCase())+
                    " and the length of the word is "+searchWord.length()+".");
            aliceWordRemoved = alice.toLowerCase().replaceFirst(searchWord.toLowerCase(), "");
            System.out.println("Sentence with word's first occurrence removed: "+aliceWordRemoved);
        }else{
            System.out.println("Word does not exist in sentence.");
        }
    }
}
