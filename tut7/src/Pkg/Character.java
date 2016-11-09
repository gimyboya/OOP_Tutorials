package Pkg;

/**
 * Created by gimy on 11/8/2016.
 */
public class Character {

    private String name;
    public int health = 100;

    public Character(){}//no arguments constructor

    public Character(String n){

        this.name = n;
    }

    public void recive_damage(int strength){

        this.health = this.health - strength;

    }

    public void uppercut(Character enemy){

        enemy.recive_damage(10);
    }
}
