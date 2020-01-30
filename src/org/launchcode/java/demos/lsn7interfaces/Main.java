package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        Comparator comparator = new FlavorComparator();

        for(int i = 0; i<flavors.size(); i++){
            System.out.println(flavors.get(i).getName());
        }

        System.out.println("-----------");

        for(int i = 0; i<cones.size(); i++){
            System.out.println(cones.get(i).getName() + " : $" + cones.get(i).getCost());
        }

        System.out.println("-----------");

        for(int i = 0; i<toppings.size(); i++){
            System.out.println(toppings.get(i).getName());
        }

        System.out.println("-----------");

        flavors.sort(comparator);
        cones.sort(new ConeComparator());
        toppings.sort(new ToppingComparator());

        for(int i = 0; i<flavors.size(); i++){
            System.out.println(flavors.get(i).getName());
        }

        System.out.println("-----------");

        for(int i = 0; i<cones.size(); i++){
            System.out.println(cones.get(i).getName() + " : $" + cones.get(i).getCost());
        }

        System.out.println("-----------");

        for(int i = 0; i<toppings.size(); i++){
            System.out.println(toppings.get(i).getName());
        }


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
