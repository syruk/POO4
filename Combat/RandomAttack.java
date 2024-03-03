package Combat;
import java.util.Random;
class RandomAttack implements Attack {
    private static final int MIN_DAMAGE = 10;
    private static final int MAX_DAMAGE = 30;

    @Override
    public int calculateDamage() {
        return new Random().nextInt(MAX_DAMAGE - MIN_DAMAGE + 1) + MIN_DAMAGE;
    }

    @Override
    public String attackType() {
        return "Random";
    }
}
