/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Milk.java
 * Description: This class is responsible for the methods and attributes of a Milk.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Milk class.
 * This class is responsible for representing a Milk.
 */
public class Milk {
    private int unit;

    /**
     * Create a Milk object using the number of milk.
     *
     * @param unit represent how many milk
     */
    public Milk(int unit){
        this.unit = unit;
    }

    /*
     * Add 1 number of milk.
     */
    public void Add(){
        this.unit += 1;
    }

    /*
     * Remove 1 number of milk
     */
    public void Remove(){
        this.unit -= 1;
    }

    /*
     * Get milk count
     */
    public int Get(){
        return this.unit;
    }
}
