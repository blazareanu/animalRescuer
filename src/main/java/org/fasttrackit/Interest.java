package org.fasttrackit;

public class Interest {
   private String name;
   private int frecquency;
   private int degreeOfHappiness;

    public Interest(String name) {
        this.name = name;
        System.out.println("But first: name");
    }

        public Interest(String name, int degreeOfHappiness) {
            this.degreeOfHappiness = degreeOfHappiness;

    }


    public double takingDecisions (double notoriety, double timeSpentInHours) {
        System.out.println("Notoriety of" + notoriety + "is defined by the time spent in the benefit of the intereste namely" + timeSpentInHours + " hours");

        double attraction = notoriety * timeSpentInHours;
        System.out.println("grade of interest: " + attraction);
        return attraction;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrecquency() {
        return frecquency;
    }

    public void setFrecquency(int frecquency) {
        this.frecquency = frecquency;
    }

    public int getDegreeOfHappiness() {
        return degreeOfHappiness;
    }

    public void setDegreeOfHappiness(int degreeOfHappiness) {
        this.degreeOfHappiness = degreeOfHappiness;
    }
}
