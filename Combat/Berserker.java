package Combat;

class Berserker extends Character {
    private static final int BASE_DAMAGE = 20;
    private static final int DAMAGE_INCREASE = 10;

    public Berserker(int health, int mana) {
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
        if (attack.attackType().equals("Ranged")) {
            health -= attack.calculateDamage() * 2;
        } else {
            health -= attack.calculateDamage() / 2;
        }
    }
}
