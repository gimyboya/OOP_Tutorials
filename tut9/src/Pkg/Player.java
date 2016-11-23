package Pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gimy on 11/23/2016.
 */
public class Player {

    private String name;
    public ArrayList<Poketball> poketball;


    public Player(String n){
        this.name = n;
        this.poketball = new ArrayList<Poketball>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPoketball(){
        int i = 0;
        Poketball pok = new Poketball();
        this.poketball.add(i, pok);
        i++;
    }
    public void catchPokemon (Pokemon pokemon){
        System.out.println("which poketball do you want to use?[enter a number] : ");
        Scanner input = new  Scanner(System.in);
        int number = input.nextInt();
        input.nextLine();

        poketball.get(number).setPokemon(pokemon);

    }



}
