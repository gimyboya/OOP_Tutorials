package Pkg;

/**
 * Created by gimy on 11/8/2016.
 */
public class Warrior extends Character {

    public Warrior(){}// no argument constructor

    public void high_five_in_the_face_with_a_chair(Character enemy){
        enemy.recive_damage(20);
    }
}
