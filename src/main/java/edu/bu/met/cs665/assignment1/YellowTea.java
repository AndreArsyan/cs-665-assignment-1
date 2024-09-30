/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: YellowTea.java
 * Description: This class is responsible for the methods and attributes of a Yellow Tea.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the YellowTea class.
 * This class is responsible for representing a Yellow Tea.
 */
public class YellowTea extends Tea {
    /**
     * Create a Yellow Tea object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public YellowTea(Integer milk, Integer sugar) {
        super(milk,sugar);
        name = "Yellow Tea";
    }
}
