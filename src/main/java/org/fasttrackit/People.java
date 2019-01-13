package org.fasttrackit;

public class People {
    String name;
    boolean loveAnimal;
    double age;

    public People(String name) {
              this.name = name;
        System.out.println("But first: name");

    }



    public double lifeHelpers(double trustworthy, double responsible) {
        System.out.println("My person is about " + trustworthy + " trustworthy and about " + responsible + " responsible. ");

        double ratePerson = trustworthy * responsible;
        System.out.println("Am I safe? " + ratePerson);
        return ratePerson;

    }
}
