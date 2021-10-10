package Advanced.Classes.Exercises.Google;

public class Person {
    private String name;
    private Company company;
    private Poke pokemon;
    private Parents parents;
    private Children children;
    private Car car;

    public Person(String name, Company company, Poke pokemon, Parents parents, Children children, Car car) {
        this.name = name;
        this.company = company;
        this.pokemon = pokemon;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }
    public Person() {

    }
}
