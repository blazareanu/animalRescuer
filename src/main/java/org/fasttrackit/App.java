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
     firstAnimal.age = 7;
    firstAnimal.healthStatus = 5;
    firstAnimal.hungerStatus = 1;
    firstAnimal.moodStatus = 4;
    firstAnimal.favoriteFood = "Pedigree Junior";
    firstAnimal.favoriteActivity = "Fetch";
    firstAnimal.furColor = "black";
    firstAnimal.likeToys = false;
    firstAnimal.eyeColor = "blue";
    firstAnimal.accesories = "bow";


            Rescuer firstRescuer = new Rescuer("Ludmila");
     firstRescuer.availableMoney = 8500.62;
     firstRescuer.otherAnimals = "a cat";
     firstRescuer.numberOfAnimals = 2;
     firstRescuer.kids = true;
     firstRescuer.partOfAssociation = true;

            AnimalFeed firstAnimalFeed = new AnimalFeed("Pedigree Junior");
          firstAnimalFeed.price = 35.00;
      firstAnimalFeed.quantity = 2;
      firstAnimalFeed.expirationDate = 859664789;
      firstAnimalFeed.stockAvailability = true;

            RecreationalActivity firstActivity = new RecreationalActivity("Fetch", 9);


            Vet firstVet = new Vet ("Becky");
        firstVet.specialization = "E.N.T";


        System.out.println(firstAnimal.name);
        System.out.println(firstAnimal.age);


             Toys firstToy = new Toys ("Gicu", 3);
       firstToy.category = "Cars";
       firstToy.producedEmotions = "sadness";


        System.out.println(firstAnimalFeed.expirationDate);


            Predators firstPredator = new Predators("George", 7);
        firstPredator.degreeOfViolence= 6;




        People helper1 = new People("Janet");
        helper1.loveAnimal= TRUE;
        helper1.age= 30;
        double safe = helper1.lifeHelpers(10,10);
        System.out.println("I think I'm safe if her/his rating is: " + helper1);
        return helper1;


    }

}

