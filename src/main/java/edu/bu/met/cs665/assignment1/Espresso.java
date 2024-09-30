/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Espresso.java
 * Description: This class is responsible for the methods and attributes of an Espresso.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Espresso class.
 * This class is responsible for representing an Espresso.
 */
public class Espresso extends Coffee {
    /**
     * Create an Espresso object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Espresso(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Espresso";
    }
}
