import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Warrior warrior = new Warrior("Thorfin", 100);
        Mage mage = new Mage("Ezreal", 80);

        Battle(warrior, mage);
        System.out.println("Battle has concluded.");
    }

    public static void Battle(Character fighter1, Character fighter2) {
        String fighterOneName = fighter1.getName();
        int fighterOneHP = fighter1.getHealth();
        System.out.println("Hailing from the west, the warrior " + fighterOneName + 
            " boasting a heart of " + fighterOneHP + 
            " trenchmen, is eager to prove his prowess on the battlefield.");

        String fighterTwoName = fighter2.getName();
        int fighterTwoHP = fighter2.getHealth();
        System.out.println("Representing the lands across eastern seas, " + fighterTwoName +
            " with a mind of " + fighterTwoHP +
            " prophets, is ready to use his wit against any who dare.");

        boolean battleOngoing = true;
        Random random = new Random();
        System.out.println("Battle begins!");
        while(battleOngoing) {
            int nextEvent = random.nextInt(4);
            switch(nextEvent) {
                case 0:
                    fighter1.attack(fighter2);
                    break;
                case 1:
                    fighter1.specialAttack(fighter2);
                    break;
                case 2:
                    fighter2.attack(fighter1);
                    break;
                case 3:
                    fighter2.specialAttack(fighter1);
                    break;
                default:
                    break;
            }    
            if (fighter1.getHealth() <= 0) {
                System.out.println(fighterOneName + " has fallen. " + fighterTwoName + " has claimed victory!");
                battleOngoing = false;
            }
            else if (fighter2.getHealth() <= 0) {
                System.out.println(fighterTwoName + " has fallen. " + fighterOneName + " is victorious!");
                battleOngoing = false;
            }
        }
    }
}