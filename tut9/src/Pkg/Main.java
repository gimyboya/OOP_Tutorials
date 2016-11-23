package Pkg;

public class Main {

    public static void main(String[] args) {

        Player Ash = new Player("Ash");
        Player Brock = new Player("Brock");

        Ash.addPoketball();
        Brock.addPoketball();

        Pokemon Pikatchu = new Pikatchu("Pikatchu", "Electric", 10);
        Pokemon Steelix = new Steelix("Steelix", "Rock", 10);

        Ash.catchPokemon(Pikatchu);
        Brock.catchPokemon(Steelix);

        Pikatchu.attack(Steelix);


    }
}
