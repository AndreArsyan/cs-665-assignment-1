/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2024
 * File Name: Beverage.java
 * Description: This class is responsible for the methods and attributes of a Beverage.
 */
package edu.bu.met.cs665.assignment1;

/**
 * This is the Beverage class.
 * This class is responsible for representing a Beverage.
 */
public class Beverage {

    protected Milk milk;
    protected Sugar sugar;
    protected String name;
    protected double price = 2;
    protected double CONDIMENT_PRICE = 0.5;

    /**
     * Create a Beverage object using milk and sugar.
     *
     * @param milk number of milk
     * @param sugar number of sugar
     */
    public Beverage(Integer milk, Integer sugar){

        if (milk < 0 || milk > 3){
            throw new IllegalArgumentException("Invalid Milk count");
        }
        if (sugar < 0 || sugar > 3){
            throw new IllegalArgumentException("Invalid Milk count");
        }
        this.milk = new Milk(milk);
        this.sugar = new Sugar(sugar);
        this.price += (CONDIMENT_PRICE * (double)sugar) + (CONDIMENT_PRICE * (double)milk);
    }

    /*
     * Add milk to the beverage
     */
    public void AddMilk() {
        if (this.milk.Get() == 3) {
            System.out.println("Maximum Milk reached");
            return;
        }
        this.price += CONDIMENT_PRICE;
        this.milk.Add();
    }

    /*
     * Remove milk from the beverage
     */
    public void RemoveMilk() {
        if (this.milk.Get() == 0) {
            System.out.println("Minimum Milk reached");
            return;
        }
        this.price -= CONDIMENT_PRICE;
        this.milk.Remove();
    }

    /*
     * Add sugar to the beverage
     */
    public void AddSugar() {
        if (this.sugar.Get() == 3) {
            System.out.println("Maximum Sugar reached");
            return;
        }
        this.price += CONDIMENT_PRICE;
        this.sugar.Add();
    }

    /*
     * Remove sugar from the beverage
     */
    public void RemoveSugar() {
        if (this.sugar.Get() == 0) {
            System.out.println("Minimum Sugar reached");
            return;
        }
        this.price -= CONDIMENT_PRICE;
        this.sugar.Remove();
    }

    /*
     * Get milk number
     */
    public int GetMilk() {
        return this.milk.Get();
    }

    /*
     * Get sugar number
     */
    public int GetSugar() {
        return this.sugar.Get();
    }

    /*
     * Get total price
     */
    public double GetPrice() {
        return this.price;
    }

    /*
     * Get beverage information
     */
    public void Get() {
        System.out.println("Beverage: "+this.name+ " with " + this.milk.Get() + " Milk and " + this.sugar.Get()+ " Sugar");
        System.out.println("Total Price: " + this.price);
    }
}

