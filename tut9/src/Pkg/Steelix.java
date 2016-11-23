package Pkg;

/**
 * Created by gimy on 11/23/2016.
 */
public class Steelix extends Pokemon {

        public Steelix(String name, String type, int damage) {

            super(name, type, damage);
        }

        @Override
        public void attack(Pokemon enemy) {

            enemy.setHealth(enemy.getHealth() - this.getDamageStrength());
            System.out.println("Steelix attacked " + enemy.getName() + " with Rock Throw");
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");

        }
}
