package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        if(!input.hasNextDouble()){
            System.out.print("Invalid entry!");
        }else {
            radius = input.nextDouble();
            while (radius < 0) {
                System.out.print("Radius cannot be negative. Enter the radius: ");
                radius = input.nextDouble();
            }
            System.out.print("The area of a circle of radius "+ radius +" is: "+Circle.getArea(radius)+".");
        }
    }
}
