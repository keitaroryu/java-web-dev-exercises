package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's length: ");
        double rectangleLength = input.nextDouble();

        System.out.println("What is the rectangle's width: ");
        double rectangleWidth = input.nextDouble();
        input.close();

        double rectangleArea = rectangleLength*rectangleWidth;

        System.out.println("The area of rectangle with length "+rectangleLength+" width "+rectangleWidth+" is "+rectangleArea+".");
    }
}
