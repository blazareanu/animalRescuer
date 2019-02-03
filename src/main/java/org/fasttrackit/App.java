package org.fasttrackit;

public class App {
    public static <sout> void main(String[] args) {

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


        //H4, POINT 5, subsection 1&2


        Rescuer firstResc = new Rescuer("John");
        Animal firstAnim = new Animal("Chaika");
        AnimalFeed firstFood = new AnimalFeed("Purina");

        firstResc.getName();
        firstAnim.getName();
        firstFood.getName();

        System.out.println(firstResc + " just gave some " + firstFood + " to " + firstAnim);


        //H4, POINT 5, subsection 3&4
        RecreationalActivity firstActiv = new RecreationalActivity("fetch", 10);

        firstActiv.getName();
        System.out.println(firstResc + " went out to play " + firstActiv + "with " + firstAnim);


        //H5. P2
        Cat firstFellow = new Cat("Nala");
        System.out.println(firstFellow.mood(9, 8, 10, 6, 10));


        Dog secondFellow = new Dog("Katyusha");
        System.out.println(secondFellow.mood(10, 10, 10, 10, 10));


        Racoon thirdFellow = new Racoon("Vivian");
        System.out.println(thirdFellow.mood(8, 8, 10, 10, 10));


        Otter fourthFellow = new Otter("Christina");
        System.out.println(fourthFellow.mood(10, 10, 10, 9, 7));


        //H6. P1

        Animal firstFellowCat = new Cat("Nala");
        System.out.println(((Cat) firstFellowCat).mood(1, 8, 10, 6, 10));


        Animal secondFellowDog = new Dog("Katyusha");
        System.out.println(((Dog) secondFellowDog).mood(10, 10, 10, 10, 10));

        Animal thirdFellowRacoon = new Racoon("Vivian");
        System.out.println(((Racoon) thirdFellowRacoon).mood(9, 8, 10, 10, 10));

        Animal fourthFellowOtter = new Otter("Christina");
        System.out.println(((Otter) fourthFellowOtter).mood(10, 10, 10, 9, 7));


        //H6. P2


    }
}

