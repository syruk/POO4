package Combat;

interface Combatant {
    int getHealth();
    void setHealth(int health);
    Attack attack();
    void defend(Attack attack);
    boolean isAlive();
}
