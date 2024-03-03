package Combat;

class Warrior extends Character {
    private static final int BASE_DAMAGE = 25;

    public Warrior(int health, int mana) {
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
        return new PhysicalAttack();
    }

    @Override
    public void defend(Attack attack) {
        // Defends very well against physical attacks
        health -= attack.calculateDamage() / 2;
    }
}
