package pkg;

/**
 * Created by gimy on 11/2/2016.
 */
public class Weapon {
    private String name;
    private int damage;

    public Weapon(String n, int d){
        this.name = n;
        this.damage = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
