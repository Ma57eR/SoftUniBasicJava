package Advanced.Classes.Exercises.Google;

import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private Company company;
    private Map<String, String> pokemons;
    private List<Parents> parents;
    private List<Children> children;
    private Map<String, Integer> car;

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }


    public List<Parents> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }




    public Person(String name) {
        this.name = name;
        this.company = null;
        this.pokemons = new LinkedHashMap<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = new LinkedHashMap<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemons(Map<String, String> pokemons) {
        this.pokemons = pokemons;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public Map<String, Integer> getCar() {
        return car;
    }

    public void setCar(Map<String, Integer> car) {
        this.car = car;
    }

    public Map<String, String> getPokemons() {
        return pokemons;
    }

    public void setPokemons(String pokeName, String pokeType) {
        getPokemons().put(pokeName, pokeType);
    }
}
