package Combat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        List<Combatant> combatants = createCombatants();

        while (combatants.size() > 1) {
            Combatant attacker = selectRandomCombatant(combatants);
            Combatant target = selectRandomCombatant(combatants, attacker);

            attack(attacker, target);

            cleanupDefeatedCombatants(combatants);
        }

        System.out.println("The winner is: " + combatants.get(0).getClass().getSimpleName());
    }

    // Create a list of combatants with a variety of instances
    private static List<Combatant> createCombatants() {
        List<Combatant> combatants = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int rand = random.nextInt(5);
            Combatant combatant = null;
            switch (rand) {
                case 0:
                    combatant = new Berserker(100, 50);
                    break;
                case 1:
                    combatant = new Wizard(80, 100);
                    break;
                case 2:
                    combatant = new Bard(90, 80);
                    break;
                case 3:
                    combatant = new Warrior(120, 0);
                    break;
                case 4:
                    combatant = new Druid(100, 200);
                    break;
            }
            combatants.add(combatant);
        }

        return combatants;
    }

    // Select a random combatant from the list
    private static Combatant selectRandomCombatant(List<Combatant> combatants) {
        Random random = new Random();
        int index = random.nextInt(combatants.size());
        return combatants.get(index);
    }

    // Select a random combatant from the list, excluding the attacker
    private static Combatant selectRandomCombatant(List<Combatant> combatants, Combatant attacker) {
        Random random = new Random();
        int index;
        do {
            index = random.nextInt(combatants.size());
        } while (combatants.get(index) == attacker);
        return combatants.get(index);
    }

    // Attack the target combatant
    private static void attack(Combatant attacker, Combatant target) {
        if (attacker.isAlive()) {
            System.out.println(attacker.getClass().getSimpleName() + " attacks " + target.getClass().getSimpleName());
            target.defend(attacker.attack());
            if (target.isAlive()) System.out.println(target.getClass().getSimpleName());
            else System.out.println(target.getClass().getSimpleName() + " health: " + "DEAD");
        }
    }

    // Cleanup defeated combatants from the list
    private static void cleanupDefeatedCombatants(List<Combatant> combatants) {
        combatants.removeIf(combatant -> !combatant.isAlive());
    }
}
