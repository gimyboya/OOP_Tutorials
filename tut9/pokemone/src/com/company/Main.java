package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Player Ash = new Player("Ash");

      Player Brook = new Player("Brook");

      Pokemone Pikatchu = new Pikatchu(100, 20);

      Pokemone Steelix = new Steelix(100, 10);

      Ash.addAPoketball(Ash.catchPokemone(Pikatchu));

      Brook.addAPoketball(Brook.catchPokemone(Steelix));

      Ash.getPoketballs().get(0).getPokemone().attack(Steelix);


    }
}
