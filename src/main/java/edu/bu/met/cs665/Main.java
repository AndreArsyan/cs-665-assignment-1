/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Main.java
 * Description: This class is responsible for the Main entry of the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment1.Beverage;
import edu.bu.met.cs665.assignment1.Espresso;

import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {

    /**
     * A main method to run examples.
     * You may use this method for development purposes as you start building your
     * assignments/final project.  This could prove convenient to test as you are developing.
     * However, please note that every assignment/final projects requires JUnit tests.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my coffee shop");
        System.out.println("What do you want to order?");

        System.out.println(
                "1. Espresso\n" +
                "2. Americano\n" +
                "3. Latte Machiatto\n" +
                "4. Green Tea\n" +
                "5. Yellow Tea\n" +
                "6. Black Tea\n");
        Integer order = input.nextInt();

        System.out.println("How much milk do you want?");
        Integer milk = input.nextInt();


        System.out.println("How much sugar do you want?");
        Integer sugar = input.nextInt();

        if (milk > 3 || sugar > 3){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        Beverage myOrder = null;
        switch (order) {
            case 1:
                myOrder = new Espresso(milk, sugar);
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }

        while (true) {
            myOrder.Get();
            System.out.println("Condiments Menu:\n" +
                    "1. Add Milk\n" +
                    "2. Remove Milk\n" +
                    "3. Add Sugar\n" +
                    "4. Remove Sugar\n" +
                    "5. Checkout and Exit\n");
            switch (input.nextInt()) {
                case 1:
                    myOrder.AddMilk();
                    break;
                case 2:
                    myOrder.RemoveMilk();
                    break;
                case 3:
                    myOrder.AddSugar();
                    break;
                case 4:
                    myOrder.RemoveSugar();
                    break;
                case 5:
                    System.out.println("Total price: " + myOrder.GetPrice());
                    System.exit(0);
            }
        }

    }


}
