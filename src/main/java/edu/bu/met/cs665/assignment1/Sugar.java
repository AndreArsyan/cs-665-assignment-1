/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Sugar.java
 * Description: This class is responsible for the methods and attributes of a Sugar.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Sugar class.
 * This class is responsible for representing a Sugar.
 */
public class Sugar {
    private int unit;

    /**
     * Create a Sugar object using the number.
     *
     * @param unit represents how much sugar unit.
     */
    public Sugar(int unit){
        this.unit = unit;
    }

    /*
     * Add 1 unit of sugar
     */
    public void Add(){
        this.unit += 1;
    }

    /*
     * Remove 1 unit of sugar
     */
    public void Remove(){
        this.unit -= 1;
    }

    /*
     * Get total number of sugar
     */
    public int Get(){
        return this.unit;
    }
}
