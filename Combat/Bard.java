package Combat;
import java.util.Random;

class Bard extends Character {
    private static final int BASE_DAMAGE = 25;
    private static final double CRITICAL_PROBABILITY = 0.1;

    public Bard(int health, int mana) {
        super(health, mana);
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int health) {

    }

    @Override
    public Attack attack() {
        Random random = new Random();
        if (random.nextDouble() < CRITICAL_PROBABILITY) {
            return new CriticalAttack();
        }
        return new RandomAttack();
    }

    @Override
    public void defend(Attack attack) {
        // Defends moderately
        health -= attack.calculateDamage();
    }
}
