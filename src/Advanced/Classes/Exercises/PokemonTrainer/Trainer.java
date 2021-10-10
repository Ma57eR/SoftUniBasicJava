package Advanced.Classes.Exercises.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Trainer {
    private int numOfBadges;
    private List<Pokemon> pokemonList;

    public Trainer(int numOfBadges, List<Pokemon> pokemonList) {
        this.numOfBadges = numOfBadges;
        this.pokemonList = new ArrayList<>();
    }

    public Trainer() {
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void setNumOfBadges() {
        this.numOfBadges++;
    }
    public List<Pokemon> getPokemons() {
        return new ArrayList<>(this.pokemonList);
    }
}
