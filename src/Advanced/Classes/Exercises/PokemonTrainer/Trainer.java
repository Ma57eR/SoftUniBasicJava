package Advanced.Classes.Exercises.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Trainer {
    private int numOfBadges;
    private List<Pokemon> pokemons;

    //Новия обект треньор е без задължителни полета
    //Като създава баджове 0 и празен лист с покемони
    public Trainer() {
        this.numOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon (Pokemon currentPokemon) {
        this.pokemons.add(currentPokemon);
    }

    public void increaseBadges() {
        this.numOfBadges++;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public int pokeSize () {
        return this.pokemons.size();
    }

    public int getNumOfBadges() {
        return numOfBadges;
    }

    public void removeDeadPokemons() {
        this.pokemons = this.pokemons.stream()
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }

}
