package ForestCamp;
import java.util.Random;
class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    public boolean sleepOrAttack() {
        Random random = new Random();
        double probability = random.nextDouble();

        if (probability <= 0.95) {
            System.out.println(name + " is sleeping...");
            return true;
        } else {
            System.out.println(name + " is attacking! Run away!");
            return false;
        }
    }
}

