package Fundamentals.ExamsPrep;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> cities = new ArrayList<>();
        String input = scan.nextLine();
        //Добавяме информация за градовете
        while (!input.equals("Sail")) {
            boolean sameCity = false;

            if (cities.size() == 0) {
                cities.add(input);
            } else {
                for (String city : cities) {
                    String currentCity = city.split("\\|\\|")[0];
                    String currentInput = input.split("\\|\\|")[0];
                    if (currentCity.equals(currentInput)) {
                        addingPopulationAndGold(cities, city, input);
                        sameCity = true;
                        break;
                    }
                }
                if (!sameCity) {
                    cities.add(input);
                }
            }

            input = scan.nextLine();
        }

        String[] command = scan.nextLine().split("=>");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Plunder":
                    cityInfo(command, cities);
                    break;
                case "Prosper":
                    prosper(command, cities);
                    break;
            }
            command = scan.nextLine().split("=>");
        }

        if (cities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %s wealthy settlements to go to:%n", cities.size());
            SortingCities(cities);
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    private static void addingPopulationAndGold(List<String> cities, String city, String input) {
        String population = String.valueOf(Integer.parseInt(city.split("\\|\\|")[1]) + Integer.parseInt(input.split("\\|\\|")[1]));
        String gold = String.valueOf(Integer.parseInt(city.split("\\|\\|")[2]) + Integer.parseInt(input.split("\\|\\|")[2]));
        cities.set(cities.indexOf(city), city.split("\\|\\|")[0] + "||" + population + "||" + gold);

    }

    private static void SortingCities(List<String> cities) {
        List<Integer> goldSorting = new ArrayList<>();
        for (String city : cities) {
//            String newOrderGold = city.split("\\|\\|")[2];
//            String newOrderCity = city.split("\\|\\|")[0];
//            String newOrderPop = city.split("\\|\\|")[1];
            goldSorting.add(Integer.parseInt(city.split("\\|\\|")[2]));

        }
        Collections.sort(cities);
        goldSorting.sort(Collections.reverseOrder());
        for (int i = 0; i < goldSorting.size(); i++) {
            for (String city : cities) {
                int currentCityGold = Integer.parseInt(city.split("\\|\\|")[2]);
                if (goldSorting.get(i) == currentCityGold) {
                    String town = city.split("\\|\\|")[0];
                    String population = city.split("\\|\\|")[1];
                    String gold = city.split("\\|\\|")[2];
                    System.out.printf("%s -> Population: %s citizens, Gold: %s kg%n", town, population, gold);
                    cities.remove(city);
                    break;
                }
            }

        }
    }


    private static void prosper(String[] command, List<String> cities) {
        String currentCity = command[1];
        String myCity;
        int goldForAdd = Integer.parseInt(command[2]);

        if (goldForAdd < 0) {
            System.out.println("Gold added cannot be a negative number!");
        } else {
            List<String> currentCityInfo;
            int cityIndex;

            for (String cit : cities) {
                if (cit.contains(currentCity)) {
                    myCity = cit;
                    cityIndex = cities.indexOf(cit);
                    currentCityInfo = Arrays.asList(myCity.split("\\|\\|"));
                    String actualCityInfo = currentCityInfo.get(0) + "||" + currentCityInfo.get(1) + "||" + (Integer.parseInt(currentCityInfo.get(2)) + goldForAdd);
                    cities.set(cityIndex, actualCityInfo);
                    System.out.printf("%s gold added to the city treasury. %s now has %s gold.%n", goldForAdd, currentCityInfo.get(0), actualCityInfo.split("\\|\\|")[2]);
                }
            }
        }
    }

    private static void cityInfo(String[] command, List<String> cities) {
        //Взимаме конкретния град
        String currentCity = command[1];
        String myCity;
        int goldStolen = Integer.parseInt(command[3]);
        int populationKilled = Integer.parseInt(command[2]);
        //Създаваме лист, който ще се пълни с информация за конкретния град
        List<String> currentCityInfo;
        int cityIndex;
        //Ако града от командата съвпада с град от листа, влиза и добавя информацията в листа
        for (String cit : cities) {
            if (cit.contains(currentCity)) {
                myCity = cit;
                cityIndex = cities.indexOf(cit);
                currentCityInfo = Arrays.asList(myCity.split("\\|\\|"));
                System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", currentCityInfo.get(0), goldStolen, populationKilled);
                if (Integer.parseInt(currentCityInfo.get(1)) - populationKilled <= 0 || Integer.parseInt(currentCityInfo.get(2)) - goldStolen <= 0) {
                    System.out.printf("%s has been wiped off the map!%n", cit.split("\\|\\|")[0]);
                    cities.remove(cityIndex);
                    break;
                } else {
                    String actualCityInfo = currentCityInfo.get(0) + "||" + (Integer.parseInt(currentCityInfo.get(1)) - populationKilled) + "||" + (Integer.parseInt(currentCityInfo.get(2)) - goldStolen);
                    cities.set(cityIndex, actualCityInfo);
                }
            }
        }
    }
}
