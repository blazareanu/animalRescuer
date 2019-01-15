package org.fasttrackit;

public class Otter extends Animal {


    public Otter(String name) {
        super(name);
    }

    public double mood(int hunger, int health, int boredom, int fear, int awareness) {
        System.out.println(" The parameteres of the mood are the following: " + " hunger " + hunger + " health " + health + " boredom " + boredom + " fear " + fear
                + " awareness " + awareness);

            String moodOtter1 = "wave";

        int score = hunger + health + boredom + fear + awareness;
        System.out.println(" The score of this fellow regarding the happiness meter is:  " + score + " which means that she is HAPPY and she will " + moodOtter1);
        return score;

    }
}