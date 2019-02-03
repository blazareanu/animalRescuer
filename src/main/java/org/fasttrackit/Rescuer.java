package org.fasttrackit;

public class Rescuer extends People {

    private double availableMoney;

    //adding other properties which may help in the game development;

    private String otherAnimals;
    private int numberOfAnimals;
    private boolean kids;
    private boolean partOfAssociation;
    private double feed;
    private double gradeOfSatisfaction;
    private double initialHungerLvl = 30;


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

    public double getFeed() {
        return feed;
    }

    public void setFeed(double feed) {
        this.feed = feed;
    }

    public double getGradeOfSatisfaction() {
        return gradeOfSatisfaction;
    }

    public void setGradeOfSatisfaction(double gradeOfSatisfaction) {
        this.gradeOfSatisfaction = gradeOfSatisfaction;
    }

    public double getInitialHungerLvl() {
        return initialHungerLvl;
    }

    public void setInitialHungerLvl(double initialHungerLvl) {
        this.initialHungerLvl = initialHungerLvl;
    }


    //as per instruction, will return a void type

    //H4, point 5, subsection 1& 2


    public void feed(Animal animal, AnimalFeed food) {
        System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName());
    }

    // H4, point 5, subsection 3& 4

    public void activity(Animal animal, RecreationalActivity recreationalActivity) {
        System.out.println(getName() + " just went out to play " + recreationalActivity.getName() +" with "+ animal.getName());


    }


    //H6
    public double initialHungerLvl(Animal animal, AnimalFeed food) {
        System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName());
        initialHungerLvl--;
        System.out.println(initialHungerLvl);
        return initialHungerLvl;


    }

}

