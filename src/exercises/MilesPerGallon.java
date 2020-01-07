package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double milesDrove = input.nextDouble();

        System.out.println("How many gallons was consumed on the commute: ");
        double gallonsConsumed = input.nextDouble();
        input.close();

        double milesPerGallon = milesDrove/gallonsConsumed;

        System.out.println("Your MPG was "+milesPerGallon+".");
    }
}
