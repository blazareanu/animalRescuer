package org.fasttrackit;

public class AnimalFeed {

    String name;
    double price;
    double quantity;
    long expirationDate;
    boolean stockAvailability;

    //adding other properties which may help in the game development;

    String type;
    String flavor;
    int popularity;
    String benefit;

    public AnimalFeed(String name) {
        this.name = name;
        System.out.println("But first: name");

    }
}