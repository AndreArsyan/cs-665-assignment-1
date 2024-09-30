/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: BlackTea.java
 * Description: This class is responsible for the methods and attributes of a Black Tea.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the BlackTea class.
 * This class is responsible for representing a Black Tea.
 */
public class BlackTea extends Tea {
    /**
     * Create a Black Tea object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public BlackTea(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Black Tea";
    }
}
