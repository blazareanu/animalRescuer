package org.fasttrackit;

public class Family {
   private String name;
   private int degreeOfAttachement;
   private String relationship;

    public Family(String name) {
        this.name = name;
        System.out.println("But first: name"+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegreeOfAttachement() {
        return degreeOfAttachement;
    }

    public void setDegreeOfAttachement(int degreeOfAttachement) {
        this.degreeOfAttachement = degreeOfAttachement;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
