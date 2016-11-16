package Pkg;

import java.util.Objects;

/**
 * Created by gimy on 11/16/2016.
 */
public class Animal {

    public Animal(){}

    public void transport(){
        System.out.println("Go from A to B");
    }

    public Food eat(Food food){
        System.out.println("Miam miam miam !");
        return food;
    }
}
