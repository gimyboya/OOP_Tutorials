package com.company;

import java.util.ArrayList;

/**
 * Created by gimy on 4/18/2017.
 */
public class Player {

  private String name;
  private ArrayList<Poketball> Poketballs = new ArrayList<>();

  public Player(String n){
    this.name = n;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addAPoketball(Poketball ball){
    this.Poketballs.add(ball);
  }

  public Poketball catchPokemone(Pokemone p){
    Poketball myPokentball = new Poketball();
    myPokentball.setPokemone(p);
    return myPokentball;
  }

  public ArrayList<Poketball> getPoketballs(){
    return this.Poketballs;
  }
}
