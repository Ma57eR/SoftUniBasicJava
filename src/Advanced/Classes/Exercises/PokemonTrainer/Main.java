package Advanced.Classes.Exercises.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}
        String[] command = scan.nextLine().split("\\s+");

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!command[0].equals("Tournament")) {
            //&quot;{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}&quot;
            String name = command[0];
            String pokeName = command[1];
            String pokeElement = command[2];
            int pokeHealth = Integer.parseInt(command[3]);
            Pokemon currentPokemon = new Pokemon(pokeName, pokeElement, pokeHealth);

            trainers.putIfAbsent(name, new Trainer());
            trainers.get(name).addPokemon(currentPokemon);


            command = scan.nextLine().split("\\s+");
        }
        System.out.println();
    }
}
