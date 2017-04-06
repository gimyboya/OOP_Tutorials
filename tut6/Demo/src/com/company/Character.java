package com.company;

/**
 * Created by gimy on 3/14/2017.
 */
public class Character {

  private String name;
  private int health;
  private int mana;
  private int attack_strength;
  private int health_potion;
  private int mana_potion;
  private Weapon weapon;

  public Character(String name, int strength){
    this.name = name;
    this.health = 100;
    this.mana = 100;
    this.attack_strength = strength;
    this.health_potion = 3;
    this.mana_potion = 3;
  }

  public boolean is_alive(){
    if(this.health <= 0){
      System.out.println(this.name + "is alive!");
      return false;
    }else{
      System.out.println(this.name + "is dead!");
      return true;
    }
  }

  public void drink_Health_potion(){
    if(this.health_potion > 0){
      if(this.health < 100){
        this.health = this.health + 30;
        this.health_potion--;
        if(this.health > 100){
          this.health = 100;
        }
        System.out.println("i see you got some health there! use it wisely!");
      }else{
        System.out.println("sorry but you are healthier than a running horse!");
      }
    }else{
      System.out.println("Sorry you are out of stock!");
    }
  }

  public void drink_mana_potion(){
    if(this.mana_potion > 0){
      if(this.mana < 100){
        this.mana = this.mana + 10;
        this.mana_potion--;
        if(this.mana > 100){
          this.mana = 100;
        }
        System.out.println("i see you got some mana there! use it wisely!");
      }else{
        System.out.println("sorry but you have more mana then harry potter!");
      }
    }else{
      System.out.println("Sorry you are out of stock!");
    }
  }

  public void normal_attack(Character enemy){
    enemy.receive_domage(this.weapon.getDamage());
    System.out.println(this.getName() + " attacked " + enemy.getName() + "with " + this.weapon.getName() );
  }

  public void magical_atack(Character enemy){
    if(mana > attack_strength){
      enemy.receive_domage(this.attack_strength);
      this.mana = this.mana - this.attack_strength;
      System.out.println(this.getName() + "attacked" + enemy.getName());
    }else{
      System.out.println("Sorry you are out of mana!!");
    }
  }

  private void receive_domage(int attack_strength) {
    this.health = this.health - attack_strength;
    System.out.println(this.getName() + "received " + attack_strength + " damage" );
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getMana() {
    return mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }

  public int getAttack_strength() {
    return attack_strength;
  }

  public void setAttack_strength(int attack_strength) {
    this.attack_strength = attack_strength;
  }

  public int getHealth_potion() {
    return health_potion;
  }

  public void setHealth_potion(int health_potion) {
    this.health_potion = health_potion;
  }

  public int getMana_potion() {
    return mana_potion;
  }

  public void setMana_potion(int mana_potion) {
    this.mana_potion = mana_potion;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
    System.out.println(this.getName() + "Is using " + weapon.getName() + " now");
  }
}
