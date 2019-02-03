package org.fasttrackit;

public class Animal {
    String name;
    String moodCat;
    String moodDog;
    String moodRacoon;
    String moodOtter;

    // i've used double for age in order to express both years and months
   private double age;
   private int healthStatus;
   private int hungerStatus;
   private int moodStatus;
   private String favoriteFood;
   private String favoriteActivity;

    //adding other properties which may help in the game development;
   private String furColor;
   private boolean likeToys;
   private String eyeColor;
   private String accesories;



    public Animal(String name) {
            this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getHungerStatus() {
        return hungerStatus;
    }

    public int setHungerStatus(int hungerStatus) {
        this.hungerStatus = hungerStatus;
        return hungerStatus;
    }

    public int getMoodStatus() {
        return moodStatus;
    }

    public int setMoodStatus(int moodStatus) {
        this.moodStatus = moodStatus;
        return moodStatus;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public boolean isLikeToys() {
        return likeToys;
    }

    public void setLikeToys(boolean likeToys) {
        this.likeToys = likeToys;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getAccesories() {
        return accesories;
    }

    public void setAccesories(String accesories) {
        this.accesories = accesories;
    }

    //H5: Overriding method



    public double mood (int hunger, int health, int boredom, int fear, int awareness) {
        System.out.println(" The parameteres of the mood are the following: " + " hunger " + hunger + " health " + health + " boredom " + boredom + " fear " + fear
                + " awareness " + awareness);

        int score = hunger + health + boredom + fear + awareness;
        System.out.println(" The score of this fellow regarding the happiness meter is:  " + score + " which means that she is HAPPY and she will" );
        return score;

    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", moodCat='" + moodCat + '\'' +
                ", moodDog='" + moodDog + '\'' +
                ", moodRacoon='" + moodRacoon + '\'' +
                ", moodOtter='" + moodOtter + '\'' +
                ", age=" + age +
                ", healthStatus=" + healthStatus +
                ", hungerStatus=" + hungerStatus +
                ", moodStatus=" + moodStatus +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", furColor='" + furColor + '\'' +
                ", likeToys=" + likeToys +
                ", eyeColor='" + eyeColor + '\'' +
                ", accesories='" + accesories + '\'' +
                '}';
    }
}
