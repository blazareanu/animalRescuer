package org.fasttrackit;

public class Rescuer extends People {

    private double availableMoney;

    //adding other properties which may help in the game development;

    private String otherAnimals;
    private int numberOfAnimals;
    private boolean kids;
    private boolean partOfAssociation;


    public Rescuer(String name) {
        super(name);
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public String getOtherAnimals() {
        return otherAnimals;
    }

    public void setOtherAnimals(String otherAnimals) {
        this.otherAnimals = otherAnimals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public boolean isKids() {
        return kids;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
    }

    public boolean isPartOfAssociation() {
        return partOfAssociation;
    }

    public void setPartOfAssociation(boolean partOfAssociation) {
        this.partOfAssociation = partOfAssociation;
    }

    //as per instruction, will return a void type

    public void firstFeeding(String animal, String food) {
        System.out.println(getName() + " just gave some " + food + " to " + animal);
        String eat = animal + " eats " + food;
        System.out.println(eat);

    }

// it won't return a void type

    public String firstActivity(String name4Rescuer, String name4Activ, String name4Animal) {
        System.out.println(name4Rescuer + " just went out to " + name4Activ + name4Animal);
        String activity = name4Rescuer + name4Activ + name4Animal;
        System.out.println(activity);

        return activity;
    }
}
