/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: GreenTea.java
 * Description: This class is responsible for the methods and attributes of a Green Tea.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the GreenTea class.
 * This class is responsible for representing a Green Tea.
 */
public class GreenTea extends Tea {
    /**
     * Create a Green Tea object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public GreenTea(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Green Tea";
    }
}
