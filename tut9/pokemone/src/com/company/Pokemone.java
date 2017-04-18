package com.company;

/**
 * Created by gimy on 4/18/2017.
 */
public abstract class Pokemone {

  private String name;
  private String type;
  private int health;
  private int damage;

  public Pokemone(String name, String type, int health, int dammage) {
    this.name = name;
    this.type = type;
    this.health = health;
    this.damage = dammage;
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

  public void setHealth(int health) {
    this.health = health;
  }

  public void receiveDammage(int dammage){
    this.health = this.health - dammage;
  }

  public abstract void attack(Pokemone enemy);

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}
