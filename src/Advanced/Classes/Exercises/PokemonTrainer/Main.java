package Advanced.Classes.Exercises.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

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
            //Създавам обекта Покемон
            Pokemon currentPokemon = new Pokemon(pokeName, pokeElement, pokeHealth);
            //Създавам нов треньор, ако го няма този
            trainers.putIfAbsent(name, new Trainer());
            //Взимаме обекта с името на треньора и добавяме към листа му с покемони конкретния покемон.
            trainers.get(name).addPokemon(currentPokemon);
            command = scan.nextLine().split("\\s+");
        }

        String element = scan.nextLine();

        while (!element.equals("End")) {

            for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
                boolean hasPokeWithSameElement = false;
                if (trainer.getValue().pokeSize() > 0) {
                    for (Pokemon pokemon : trainer.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(element)) {
                            trainer.getValue().increaseBadges();
                            hasPokeWithSameElement = true;
                            break;
                        }
                    }
                }
                if (!hasPokeWithSameElement) {
                    for (Pokemon poke : trainer.getValue().getPokemons()) {
                        poke.setHealth(poke.getHealth() - 10);
                        trainer.getValue().removeDeadPokemons();
                    }
                }
            }
            element = scan.nextLine();
        }

        trainers.entrySet()
                .stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> {
                    System.out.println(t.getKey() + " " + t.getValue().getNumOfBadges() + " " + t.getValue().pokeSize());
                });

//        for (Map.Entry<String, Trainer> trainerEntry : trainers.entrySet()) {
//            System.out.println(trainerEntry.getKey() + " " + trainerEntry.getValue().getNumOfBadges() + " " + trainerEntry.getValue().pokeSize());
//        }
    }
}

