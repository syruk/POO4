package ForestCamp;
import java.util.Random;

public class ForestCampingSimulation {
    public static void main(String[] args) {

        String[] landAnimalNames = {"Bear", "Wolf", "Fox", "Deer"};
        String[] landAnimalSounds = {"Growl", "Howl", "Yip", "Bellow"};


        String[] marineAnimalNames = {"Dolphin", "Whale", "Shark"};
        String[] marineAnimalSounds = {"Click", "Song", "Chomp"};

        System.out.println("Welcome to the Forest Camping Simulation!");
        System.out.println("Listen carefully...");

        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(1000);


                Animal animal;
                if (random.nextBoolean()) {
                    int index = random.nextInt(landAnimalNames.length);
                    animal = new LandAnimal(landAnimalNames[index], landAnimalSounds[index]);
                } else {
                    int index = random.nextInt(marineAnimalNames.length);
                    animal = new MarineAnimal(marineAnimalNames[index], marineAnimalSounds[index]);
                }


                animal.makeSound();


                if (!animal.sleepOrAttack()) {

                    System.out.println("You were attacked! Run away from the forest!");
                    break;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

