package org.fasttrackit;

public class Rescuer extends People {

   private double availableMoney;

    //adding other properties which may help in the game development;

    private   String otherAnimals;
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
}
