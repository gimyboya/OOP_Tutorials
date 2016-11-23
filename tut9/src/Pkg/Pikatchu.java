package Pkg;

/**
 * Created by gimy on 11/23/2016.
 */
public class Pikatchu extends Pokemon{


    public Pikatchu(String name, String type, int damage) {
        super(name, type, damage);
    }

    @Override
    public void attack(Pokemon enemy) {

        enemy.setHealth(enemy.getHealth() - this.getDamageStrength());
        System.out.println("Pikachu attacked " + enemy.getName() + " with Shock Wave");
        System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");

    }
}
