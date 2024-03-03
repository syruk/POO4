package Combat;

class Druid extends Character {
    private static final int BASE_DAMAGE = 30;

    public Druid(int health, int mana) {
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
        if (mana > 0) {
            mana -= 10;
            return new MagicalAttack();
        } else {
            return null;
        }
    }

    @Override
    public void defend(Attack attack) {
        if (mana > 0) {
            mana -= 10;
        } else {
            health = 0;
        }
    }
}
