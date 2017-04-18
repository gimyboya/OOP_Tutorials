package com.company;

/**
 * Created by gimy on 4/18/2017.
 */
public class Poketball {
  private Pokemone pokemone;

  public Poketball(Pokemone p){
    this.pokemone = p;
  }

  public Poketball(){

  }


  public Pokemone getPokemone() {
    return pokemone;
  }

  public void setPokemone(Pokemone pokemone) {
    this.pokemone = pokemone;
  }
}
