package org.fasttrackit;

/**;
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

            Animal firstAnimal = new Animal();
    firstAnimal.name = "Charlie";
    firstAnimal.age = 7;
    firstAnimal.healthStatus = 5;
    firstAnimal.hungerStatus = 1;
    firstAnimal.moodStatus = 4;
    firstAnimal.favoriteFood = "Pedigree Junior";
    firstAnimal.favoriteActivity = "Fetch";

            Rescuer firstRescuer = new Rescuer();
     firstRescuer.name = "Mike";
     firstRescuer.availableMoney = 8500.62;

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

            Game firstGame = new Game();
    firstGame.dog = "Charlie";
    firstGame.rescuer = "Mike";
    firstGame.vet = "Jane";

        System.out.println(firstAnimal.name);
        System.out.println(firstAnimal.age);



    }
}

