public class Mage extends Character {

    public Mage(String name, int health) {
            super(name, health);
        }
    
    @Override
    public void tookDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " takes a hit their elixir was not prepared for. " + name + "'s salubrity has dwindled to: " + health);
    }

    @Override
    public void specialAttack(Character target) {
        String targetName = target.name;
        System.out.println("MERLINS BEARD! " + name + " unleashes an energy that will curse " + targetName + " for generations to come!");
        target.tookDamage(25);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.name;
        System.out.println(name + " sends a roaring fireball into " + targetName + "'s center mass!");
        target.tookDamage(5);
    }
    
}
