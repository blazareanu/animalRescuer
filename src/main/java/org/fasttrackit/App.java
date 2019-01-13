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

            Animal firstAnimal = new Animal();
    firstAnimal.name = "Charlie";
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

            Rescuer firstRescuer = new Rescuer();
     firstRescuer.name = "Mike";
     firstRescuer.availableMoney = 8500.62;
     firstRescuer.otherAnimals = "a cat";
     firstRescuer.numberOfAnimals = 2;
     firstRescuer.kids = true;
     firstRescuer.partOfAssociation = true;

            AnimalFeed firstAnimalFeed = new AnimalFeed();
      firstAnimalFeed.name = "Pedigree Junior";
      firstAnimalFeed.price = 35.00;
      firstAnimalFeed.quantity = 2;
      firstAnimalFeed.expirationDate = 859664789;
      firstAnimalFeed.stockAvailability = true;

            RecreationalActivity firstActivity = new RecreationalActivity();
      firstActivity.name = "Fetch";

            Vet firstVet = new Vet ();
       firstVet.name = "Jane";
       firstVet.specialization = "E.N.T";


        System.out.println(firstAnimal.name);
        System.out.println(firstAnimal.age);

             Toys firstToy = new Toys ();
        firstToy.name = "Gicu";
        firstToy.category = "Cars";
        firstToy.degreeOfLovingToy = 10;

        System.out.println(firstAnimalFeed.expirationDate);

        People helper1 = new People();
        helper1.name= "Person 1";
        helper1.loveAnimal= TRUE;
        helper1.age= 30;
        double safe = helper1.lifeHelpers(10,10);
        System.out.println("I think I'm safe if her/his rating is: " + helper1);
        return helper1;


    }

}

