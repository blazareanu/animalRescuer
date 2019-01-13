package org.fasttrackit;

public class RecreationalActivity extends Interest{


    //adding other properties which may help in the game development;
    String benefit;
   private boolean outdoor;
   private boolean otherParticipants;


    public RecreationalActivity(String name, int degreeOfHappiness) {
        super(name, degreeOfHappiness);
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public boolean isOtherParticipants() {
        return otherParticipants;
    }

    public void setOtherParticipants(boolean otherParticipants) {
        this.otherParticipants = otherParticipants;
    }
}
