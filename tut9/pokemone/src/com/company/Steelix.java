package com.company;

/**
 * Created by gimy on 4/18/2017.
 */
public class Steelix extends Pokemone {

  public Steelix(int health, int dammage) {
    super("Steelix", "Earth", health, dammage);
  }

  @Override
  public void attack(Pokemone enemy) {
    enemy.receiveDammage(this.getDamage());
    System.out.println("Pikachu attacked " + enemy.getName() + " with Rock Throw");
    System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");
  }
}
