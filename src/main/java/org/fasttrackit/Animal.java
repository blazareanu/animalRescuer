package org.fasttrackit;

public class Animal {
    String name;
    // i've used double for age in order to express both years and months
    double age;
    int healthStatus;
    int hungerStatus;
    int moodStatus;
    String favoriteFood;
    String favoriteActivity;

    //adding other properties which may help in the game development;
    String furColor;
    boolean likeToys;
    String eyeColor;
    String accesories;

    public Animal(String name) {
            this.name = name;
            System.out.println("But first: name");

    }



}
