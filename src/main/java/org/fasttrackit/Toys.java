package org.fasttrackit;

public class Toys extends Interest {

   private String category;
   private String producedEmotions;


    public Toys(String name, int degreeOfHappiness) {
        super(name, degreeOfHappiness);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducedEmotions() {
        return producedEmotions;
    }

    public void setProducedEmotions(String producedEmotions) {
        this.producedEmotions = producedEmotions;
    }
}
