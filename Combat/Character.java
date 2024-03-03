package Combat;

abstract class Character implements Combatant {
    protected int health;
    protected int mana;


    public Character(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
