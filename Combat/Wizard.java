package Combat;

import static Combat.MagicalAttack.MANA_COST;

class Wizard extends Character {
    private static final int BASE_DAMAGE = 30;

    public Wizard(int health, int mana) {
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
        if (mana >= MANA_COST) {
            mana -= MANA_COST;
            return new MagicalAttack();
        } else {
            return new PhysicalAttack();
        }
    }

    @Override
    public void defend(Attack attack) {
        if (attack.attackType().equals("Melee")) {
            health -= attack.calculateDamage() * 2;
        }
    }
}
