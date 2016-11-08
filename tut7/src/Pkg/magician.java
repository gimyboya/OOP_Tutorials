package Pkg;

/**
 * Created by gimy on 11/9/2016.
 */
public class magician extends Character {
    private int mana;

    public void abra_kadabra(Character enemy){
        enemy.recive_damage(20);
        this.mana -= 10;
    }
}
