package org.fasttrackit;

public class Career extends Interest{

   private String position;
   private double numberOfYears;

    public Career(String name, int degreeOfHappiness) {
        super(name, degreeOfHappiness);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(double numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
}
