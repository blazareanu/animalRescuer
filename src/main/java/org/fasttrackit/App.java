package org.fasttrackit;

import static java.lang.Boolean.TRUE;


public class App {
    public static void main(String[] args) {

        Animal firstAnimal = new Animal("Bruno");
        firstAnimal.setAge(7);
        firstAnimal.setHealthStatus(5);
        firstAnimal.setHungerStatus(1);
        firstAnimal.setMoodStatus(4);
        firstAnimal.setFavoriteFood("Pedigree Junior");
        firstAnimal.setFavoriteActivity("Fetch");
        firstAnimal.setFurColor("black");
        firstAnimal.setLikeToys(true);
        firstAnimal.setEyeColor("blue");
        firstAnimal.setAccesories("bow");


        Rescuer firstRescuer = new Rescuer("Ludmila");
        firstRescuer.setAvailableMoney(8500.62);
        firstRescuer.setOtherAnimals("a cat");
        firstRescuer.setNumberOfAnimals(2);
        firstRescuer.setKids(true);
        firstRescuer.setPartOfAssociation(true);

        AnimalFeed firstAnimalFeed = new AnimalFeed("Pedigree Junior");
        firstAnimalFeed.setPrice(35);
        firstAnimalFeed.setQuantity(2);
        firstAnimalFeed.setExpirationDate(3659555);
        firstAnimalFeed.setStockAvailability(true);


        RecreationalActivity firstActivity = new RecreationalActivity("Fetch", 9);


        Vet firstVet = new Vet("Becky");
        firstVet.setSpecialization("E.N.T");


        Toys firstToy = new Toys("Gicu", 3);
        firstToy.setCategory("Cars");
        firstToy.setProducedEmotions("sadness");


        Predators firstPredator = new Predators("George", 7);
        firstPredator.setDegreeOfViolence(6);


        People helper1 = new People("Janet");
        helper1.setLoveAnimal(true);
        helper1.setAge(30);
        double safe = helper1.lifeHelpers(10, 10);
        System.out.println("I think I'm safe if her/his rating is: " + helper1);


        //H4, POINT 5, SUB-POINT 1

        Rescuer feed1 = new Rescuer("John");
        feed1.setName("John");
        Rescuer firstResc = new Rescuer("John");
        Animal firstAnim = new Animal("Chaika");
        AnimalFeed firstFood = new AnimalFeed("Purina");

        System.out.println(firstResc + " just gave some " + firstFood + " to " + firstAnim);

        //H4, POINT 5, SUB-POINT 3
        Rescuer activity1 = new Rescuer("Mike");
        Rescuer nameResc2 = new Rescuer("Mike");
        RecreationalActivity nameActiv2 = new RecreationalActivity("walks", 6);
        Animal nameAnim = new Animal("Brian");
        String activ = activity1.firstActivity("Mike", " walk ", "Brian");
        System.out.println(activ);


        //H5. P2
       Cat firstFellow = new Cat("Nala");
        firstFellow.mood(9, 8, 10, 6, 10);


        Dog secondFellow = new Dog("Katyusha");
        secondFellow.mood(10,10,10,10,10);

        Racoon thirdFellow = new Racoon("Vivian");
        thirdFellow.mood(8,8,10,10,10);

        Otter fourthFellow = new Otter("Christina");
        fourthFellow.mood(10,10,10,9,7);


    }
}

