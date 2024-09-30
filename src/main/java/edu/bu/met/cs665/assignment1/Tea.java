/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Tea.java
 * Description: This class is responsible for the methods and attributes of a Tea.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Tea class.
 * This class is responsible for representing a Tea.
 */
public class Tea extends Beverage {
    /**
     * Create a Tea object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Tea(Integer milk, Integer sugar) {
        super(milk,sugar);
    }
}
