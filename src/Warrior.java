public class Warrior extends Character {

    public Warrior(String name, int health) {
            super(name, health);
        }
    
    @Override
    public void tookDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " took " + damage + " damage to their armor! " + name + " has but this much strength left before they leave for Valhalla: " + health);
    }
        
    @Override
    public void attack(Character target) {
        String targetName = target.name;
        System.out.println(name + " swung their sword at " + targetName + "! Unleashing a disorienting strike to their foe!");
        target.tookDamage(10);
    }

    @Override
    public void specialAttack(Character target) {
        String targetName = target.name;
        System.out.println(name + " swung their sword with the strength of 10,000 men! " + targetName + " must pray to the gods they don't dwindle in health.");
        target.tookDamage(20);
    }
    
}
