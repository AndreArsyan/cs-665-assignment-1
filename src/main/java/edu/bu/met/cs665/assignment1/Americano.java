/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Americano.java
 * Description: This class is responsible for the methods and attributes of an Americano Coffee.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Americano class.
 * This class is responsible for representing an Americano Coffee.
 */
public class Americano extends Coffee {
    /**
     * Create an Americano object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Americano(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Americano";
    }
}
