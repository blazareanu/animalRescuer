package org.fasttrackit;

public class People {
   private String name;
    private boolean loveAnimal;
   private double age;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoveAnimal() {
        return loveAnimal;
    }

    public void setLoveAnimal(boolean loveAnimal) {
        this.loveAnimal = loveAnimal;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
