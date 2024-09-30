/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Latte.java
 * Description: This class is responsible for the methods and attributes of a Latte.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Latte class.
 * This class is responsible for representing a Latte Machiatto.
 */
public class Latte extends Coffee {
    /**
     * Create a Latte object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Latte(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Latte Machiatto";
    }
}
