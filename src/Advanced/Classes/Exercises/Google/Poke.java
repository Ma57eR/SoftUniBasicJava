package Advanced.Classes.Exercises.Google;

public class Poke {
    private String pokemonName;
    private String pokemonType;

    public Poke(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }
}
