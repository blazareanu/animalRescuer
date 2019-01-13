package org.fasttrackit;

public class Predators {
   private String name;
   private int degreeOfViolence;
   private int degreeOfFear;


        public Predators(String name, int degreeOfFear) {
            this.name = name;
            this.degreeOfFear = degreeOfFear;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegreeOfViolence() {
        return degreeOfViolence;
    }

    public void setDegreeOfViolence(int degreeOfViolence) {
        this.degreeOfViolence = degreeOfViolence;
    }

    public int getDegreeOfFear() {
        return degreeOfFear;
    }

    public void setDegreeOfFear(int degreeOfFear) {
        this.degreeOfFear = degreeOfFear;
    }
}
