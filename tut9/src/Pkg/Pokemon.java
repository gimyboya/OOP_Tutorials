package Pkg;

/**
 * Created by gimy on 11/23/2016.
 */
public abstract class Pokemon {
    private String name;
    private String type;
    private int damageStrength;
    private int health = 100;

    public Pokemon(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damageStrength = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamageStrength(int damageStrength) {
        this.damageStrength = damageStrength;
    }

    public int getDamageStrength(){
        return this.damageStrength;
    }

    public void receive_damage(Pokemon enemy){
        this.health = this.health - enemy.getDamageStrength();
    }

    public abstract void attack(Pokemon enemy);
}
