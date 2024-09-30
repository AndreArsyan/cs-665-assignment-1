/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Coffee.java
 * Description: This class is responsible for the methods and attributes of a Coffee.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Coffee class.
 * This class is responsible for representing a Coffee.
 */
public class Coffee extends Beverage {
    /**
     * Create a Coffee object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Coffee(Integer milk, Integer sugar) {
        super(milk, sugar);
    }
}
