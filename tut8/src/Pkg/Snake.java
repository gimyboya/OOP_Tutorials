package Pkg;

/**
 * Created by gimy on 11/16/2016.
 */
public class Snake extends Animal {
    public Snake(){}

    @Override
    public void transport(){

        System.out.println("Go from A to B ramping");
    }

    public Food eat(Human food){ //overriding
        System.out.println("This is delicious!");
        return food;
    }
}
