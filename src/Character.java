public abstract class Character implements Attackable{
    protected String name;
    protected int health;
    protected int id;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    
    public abstract void attack(Character target);
    public abstract void specialAttack(Character target);
}
