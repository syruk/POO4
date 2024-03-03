package Combat;
import java.util.Random;
class MagicalAttack implements Attack {
    private static final int DANIO_MINIMO = 20;
    private static final int DANIO_MAXIMO = 40;
    static final int MANA_COST = 10;

    @Override
    public int calculateDamage() {
        return new Random().nextInt(DANIO_MAXIMO - DANIO_MINIMO + 1) + DANIO_MINIMO;
    }

    @Override
    public String attackType() {
        return "Ranged";
    }
}
