package org.fasttrackit;

public class Interest {
    String name;
    int frecquency;
    int degreeOfHappiness;

    public double takingDecisions (double notoriety, double timeSpentInHours) {
        System.out.println("Notoriety of" + notoriety + "is defined by the time spent in the benefit of the intereste namely" + timeSpentInHours + " hours");

        double attraction = notoriety * timeSpentInHours;
        System.out.println("grade of interest: " + attraction);
        return attraction;

    }
}
