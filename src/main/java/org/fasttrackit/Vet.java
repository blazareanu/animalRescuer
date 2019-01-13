package org.fasttrackit;

public class Vet  extends People{

    private String specialization;

    //adding other proprieties which may help in the game development;
    private double experience;
    private String behaviour;
    private double age;


    public Vet(String name) {
        super(name);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public double getAge() {
        return age;
    }

    @Override
    public void setAge(double age) {
        this.age = age;
    }
}
