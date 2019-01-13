package org.fasttrackit;

import static java.lang.Boolean.TRUE;

/**;
 * Hello world!
 *
 */
public class App 
{
    public static People main(String[] args )
    {

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


            Vet firstVet = new Vet ("Becky");
        firstVet.setSpecialization("E.N.T");


             Toys firstToy = new Toys ("Gicu", 3);
       firstToy.setCategory("Cars");
       firstToy.setProducedEmotions("sadness");




            Predators firstPredator = new Predators("George", 7);
        firstPredator.setDegreeOfViolence(6);




        People helper1 = new People("Janet");
        helper1.setLoveAnimal(true);
        helper1.setAge(30);
        double safe = helper1.lifeHelpers(10,10);
        System.out.println("I think I'm safe if her/his rating is: " + helper1);
        return helper1;


    }

}

