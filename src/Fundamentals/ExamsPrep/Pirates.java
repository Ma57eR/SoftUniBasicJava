package Fundamentals.ExamsPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> cities = new ArrayList<>();
        String input = scan.nextLine();
        //Добавяме информация за градовете
        while (!input.equals("Sail")) {
            cities.add(input);
            input = scan.nextLine();
        }

        String[] command = scan.nextLine().split("=>");
        String[] city = new String[4];

        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Plunder":
                    cityInfo(city, command, cities);
                    break;
                case "Prosper":
                    break;
            }
            command = scan.nextLine().split("=>");
        }
    }

    private static void cityInfo(String[] city, String[] command, List<String> cities) {
        //Взимаме конкретния град
        String currentCity = command[1];
        String myCity = "";
        int goldStolen = Integer.parseInt(command[3]);
        int populationKilled = Integer.parseInt(command[2]);
        //Създаваме лист, който ще се пълни с информация за конкретния град
        List<String> currentCityInfo = new ArrayList<>();
        int cityIndex = 0;
        //Ако града от командата съвпада с град от листа, влиза и добавя информацията в листа
        for (String cit : cities) {
            if (cit.contains(currentCity)) {
                myCity = cit;
                cityIndex = cities.indexOf(cit);
                currentCityInfo = Arrays.asList(myCity.split("\\|\\|"));
                System.out.printf("%s plundered! %s gold stolen, %s citizens killed.", currentCityInfo.get(0), goldStolen, populationKilled);
                String actualCityInfo = currentCityInfo.get(0)  + "||" + (Integer.parseInt(currentCityInfo.get(1)) - populationKilled) + "||" +(Integer.parseInt(currentCityInfo.get(2)) - goldStolen);
                cities.set(cityIndex, actualCityInfo);
            }
        }






    }
}
