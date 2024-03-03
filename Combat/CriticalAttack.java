package Combat;
import java.util.Random;
class CriticalAttack implements Attack {
    private static final int DAMAGE = 100;

    @Override
    public int calculateDamage() {
        return DAMAGE;
    }

    @Override
    public String attackType() {
        return "Critical";
    }
}
