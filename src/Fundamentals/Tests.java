package Fundamentals;

import Fundamentals.FinalExams.Heroes;

import java.util.*;
import java.util.stream.Collectors;

public class Tests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> peopledb = new ArrayList<>();
        List<Hero> heroesDB = new ArrayList<>();
        Random myRandom = new Random();

//        for (int i = 0; i < 10; i++) {
//            int rand = myRandom.nextInt(100);
//            Person currentPerson = new Person("Ivan" + i, i, rand, "Sofia" + i);
//            peopledb.add(currentPerson);
//        }

//        for (int i = 0; i < 10; i++) {
//            int rand = myRandom.nextInt(50);
//            Hero currentHero = new Hero("Ivan" + i, 50+rand, 50 +rand);
//            heroesDB.add(currentHero);
//        }
        Hero hero1 = new Hero ("Ivan", 50, 51);
        heroesDB.add(hero1);
        Hero hero2 = new Hero ("Pesho", 50, 52);
        heroesDB.add(hero2);

//        heroesDB.stream()
//                .sorted(Comparator.comparing(Hero::getHp).reversed())
//                .forEach(hero -> {
//                    System.out.println("Hero: " + hero.name);
//                    System.out.println("    HP: " + hero.hp);
//                    System.out.println("    MP: " + hero.mp);
//                });
        List<Hero> sortedHeroesByHP = heroesDB.stream()
                .sorted(Comparator.comparing(Hero::getHp).reversed())
                        .collect(Collectors.toList());
        List<Hero> sortedHeroesByHPAndMP = heroesDB.stream()
                        .sorted(Comparator.comparing(Hero::getHp).reversed().thenComparing(Hero::getMp).reversed())
                                .collect(Collectors.toList());

//        heroesDB.stream()
//                .sorted(Comparator.comparing(Hero::getHp).reversed().thenComparing(Hero::getMp).reversed())
//                .forEach(hero -> {
//                    System.out.println("Hero: " + hero.name);
//                    System.out.println("    HP: " + hero.hp);
//                    System.out.println("    MP: " + hero.mp);
//                });

        System.out.println("Sorted by HP Only");
        for (Hero hero : sortedHeroesByHP) {
            System.out.println("Hero name: " + hero.name);
            System.out.println("    HP: " + hero.hp);
            System.out.println("    MP: " + hero.mp);
        }
        System.out.println();
        System.out.println("Sorted by HP and then by MP");
        for (Hero hero : sortedHeroesByHPAndMP) {
            System.out.println("Hero name: " + hero.name);
            System.out.println("    HP: " + hero.hp);
            System.out.println("    MP: " + hero.mp);
        }

//        peopledb.stream()
//                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
//                .forEach(person -> {
//                    System.out.println(person.age + " " + person.id + " " + person.name + " " + person.city);
//                });
//        heroesDB.stream()
//                .sorted(Comparator.comparing(Hero::getHp).reversed().thenComparing(Hero::getMp).reversed())
//                .forEach(hero -> {
//                    System.out.println("Hero name" + hero.name);
//                    System.out.println("  HP: " + hero.hp);
//                    System.out.println("  MP: " + hero.mp);
//                });
    }


    private static class Person {
        private String name;
        private int id;
        private int age;
        private String city;

        public Person(String name, int id, int age, String city) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

private static class Hero {
        String name;
        int hp;
        int mp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;


    }
}

}
