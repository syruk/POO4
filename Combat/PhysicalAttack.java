package Combat;
import java.util.Random;
class PhysicalAttack implements Attack {
    private static final int DANIO_MINIMO = 10;
    private static final int DANIO_MAXIMO = 30;

    @Override
    public int calculateDamage() {
        return new Random().nextInt(DANIO_MAXIMO - DANIO_MINIMO + 1) + DANIO_MINIMO;
    }

    @Override
    public String attackType() {
        return "Melee";
    }
}
