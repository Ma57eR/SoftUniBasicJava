package Fundamentals.FinalExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Heroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfHeroes = Integer.parseInt(scan.nextLine());
        Map<String, Integer> heroMP = new LinkedHashMap<>();
        Map<String, Integer> heroHP = new LinkedHashMap<>();

        for (int i = 0; i < numOfHeroes; i++) {
            String[] heroInfo = scan.nextLine().split(" ");
            String heroName = heroInfo[0];
            String heroHPInfo = heroInfo[1];
            String heroMPInfo = heroInfo[2];
            heroHP.put(heroName, Integer.parseInt(heroHPInfo));
            heroMP.put(heroName, Integer.parseInt(heroMPInfo));
        }

        String[] commands = scan.nextLine().split(" - ");
        String hero = "";
        while (!commands[0].equals("End")) {
            String commandType = commands[0];
            switch (commandType) {
                case "CastSpell":
                    //CastSpell – {hero name} – {MP needed} – {spell name}
                     hero = commands[1];
                    int mpNeeded = Integer.parseInt(commands[2]);
                    String castSpellName = commands[3];
                    if (isMPEnough(hero, heroMP, mpNeeded)) {
                        heroMP.put(hero, heroMP.get(hero) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, castSpellName, heroMP.get(hero));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!", hero, castSpellName);
                    }
                    break;
                case "TakeDamage":
                    //TakeDamage – {hero name} – {damage} – {attacker}
                    hero = commands[1];
                    int damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    if (isHeroAlive(hero, damage, heroHP)) {
                        heroHP.put(hero, heroHP.get(hero) - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!", hero, damage, attacker, heroHP.get(hero));
                    } else {
                        System.out.printf("%s has been killed by %s!", hero, attacker);
                    }
                    break;

                case "Recharge":
                    //Recharge – {hero name} – {amount}
                    hero = commands[1];
                    int recharged = 0;
                    int rechargeMP = Integer.parseInt(commands[2]);
                    if (manaIsAboveMax(heroMP, hero, rechargeMP)) {
                        recharged = 200 - heroMP.get(hero);
                        heroMP.put(hero, 200);
                    } else {
                        heroMP.put(hero, heroMP.get(hero) + rechargeMP);
                        recharged = rechargeMP;
                    }
                    System.out.printf("%s recharged for %d MP!", hero, recharged);
                    break;

                case "Heal":
                    break;
            }
            commands = scan.nextLine().split(" - ");
        }
    }

    private static boolean manaIsAboveMax(Map<String, Integer> heroStats, String hero, int recharge) {
        return  heroStats.get(hero) + recharge > 200;
    }

    private static boolean isHeroAlive(String takeDamageHero, int damage, Map<String, Integer> heroHP) {
        return heroHP.get(takeDamageHero) > damage;
    }

    private static boolean isMPEnough(String castHeroName, Map<String, Integer> heroMP, int mpNeeded) {
        return heroMP.get(castHeroName) >= mpNeeded;
    }
}
