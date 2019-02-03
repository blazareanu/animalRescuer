package org.fasttrackit;

public class AnimalFeed {

    String name;
    private double price;
    private double quantity;
    private long expirationDate;
    private boolean stockAvailability;

    //adding other properties which may help in the game development;

   private String type;
   private String flavor;
   private int popularity;
   private String benefit;

    public AnimalFeed(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }


    @Override
    public String toString() {
        return "AnimalFeed{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate=" + expirationDate +
                ", stockAvailability=" + stockAvailability +
                ", type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                ", popularity=" + popularity +
                ", benefit='" + benefit + '\'' +
                '}';
    }
}