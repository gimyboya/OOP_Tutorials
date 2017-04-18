package com.company;

/**
 * Created by gimy on 4/18/2017.
 */
public class Pikatchu extends Pokemone{

  public Pikatchu(int health, int dammage) {
    super("Pikatchu", "Electric", health, dammage);
  }

  @Override
  public void attack(Pokemone enemy) {
    enemy.receiveDammage(this.getDamage());
    System.out.println("Pikachu attacked " + enemy.getName() + " with Shock Wave");
    System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");
  }
}
