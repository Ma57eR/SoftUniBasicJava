package Fundamentals.FinalExams;

import java.util.*;

public class Battle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> heroHP = new TreeMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();

        String[] command = scan.nextLine().split(":");

        while (!command[0].equals("Results")) {
            switch (command[0]) {
                case "Add":
                    String heroName = command[1];
                    int currentHeroHP = Integer.parseInt(command[2]);
                    int currentHeroMP = Integer.parseInt(command[3]);
                    if (isHeroExist(heroName, heroHP)) {
                        int thisHeroHP = heroHP.get(heroName);
                        heroHP.put(heroName, currentHeroHP + thisHeroHP);
                    } else {
                        heroHP.put(heroName, currentHeroHP);
                        heroMP.put(heroName, currentHeroMP);
                    }
                    break;

                case "Attack":
                    String attackerName = command[1];
                    String defenderName = command[2];
                    int damage = Integer.parseInt(command[3]);
                    if (heroesExist(heroHP, heroMP, attackerName, defenderName)) {

                        if (defenderWillSurvive(heroHP, damage, defenderName)) {
                            if (attackerHasMana(heroMP, attackerName)) {
                                heroHP.put(defenderName, heroHP.get(defenderName) - damage);
                                heroMP.put(attackerName, heroMP.get(attackerName) - 1);
                            } else {// HeroMP не оцелява
                                heroMP.remove(attackerName);
                                heroHP.remove(attackerName);
                                System.out.println(attackerName + " was disqualified!");

                            }
                        } else {//HeroHP не оцелява
                            heroHP.remove(defenderName);
                            heroMP.remove(defenderName);
                            System.out.println(defenderName + " was disqualified!");
                            if (heroMP.get(attackerName) - 1 <= 0) {
                                heroMP.remove(attackerName);
                                heroHP.remove(attackerName);
                                System.out.println(attackerName + " was disqualified!");
                            }
                        }

                    }
                    break;

                case "Delete":
                    String deleteHero = command[1];
                    if (isHeroExist(deleteHero, heroHP)) {
                        heroHP.remove(deleteHero);
                        heroMP.remove(deleteHero);
                    }
                    if (deleteHero.equals("All")) {
                        heroHP.clear();
                        heroMP.clear();
                    }
                    break;

            }
            command = scan.nextLine().split(":");
        }

        System.out.println("People count: " + heroHP.size());
        if (heroHP.size() > 0) {
        heroHP.entrySet().stream()
                .sorted((h1, h2) -> h2.getValue().compareTo(h1.getValue()))
                .forEach(hero -> {
                    System.out.print(hero.getKey() + " - ");
                    System.out.print(hero.getValue() + " - ");
                    System.out.println(heroMP.get(hero.getKey()));
                });
        }


    }

    private static boolean attackerHasMana(Map<String, Integer> heroMP, String attackerName) {
        return heroMP.get(attackerName) - 1 > 0;
    }

    private static boolean defenderWillSurvive(Map<String, Integer> heroHP, int damage, String defender) {
        return heroHP.get(defender) - damage > 0;
    }

    private static boolean heroesExist(Map<String, Integer> heroHP, Map<String, Integer> heroMP, String attacker, String defender) {
        return heroHP.containsKey(attacker) && heroMP.containsKey(defender);
    }

    private static boolean isHeroExist(String heroName, Map<String, Integer> heroHP) {
        return heroHP.containsKey(heroName);
    }
}
