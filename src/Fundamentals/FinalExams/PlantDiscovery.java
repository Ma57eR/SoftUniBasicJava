package Fundamentals.FinalExams;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Plant> currentPlants = new LinkedHashMap<>();
//        Map<String, Double> plantsRarity = new LinkedHashMap<>();
//        //Първо са рейтитингите, след това името на цветето
//        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();
//        //Добавяме информацията в списъка за Rarity
//        for (int i = 0; i < n; i++) {
//            String[] rarityInfo = scan.nextLine().split("<->");
//            plantsRarity.put(rarityInfo[0], Double.parseDouble(rarityInfo[1]));
//        }
//
//        String[] input = scan.nextLine().split(":");
//
//        while (!input[0].equals("Exhibition")) {
//
//            switch (input[0]) {
//                case "Rate":
//                    String[] plantRatingInfo = input[1].split(" - ");
//                    //Проверяваме дали съществува записа
//                    if (!plantsRating.containsKey(plantRatingInfo[0])) {
//                        plantsRating.put(plantRatingInfo[0], new ArrayList<>());
//                    }
//                    plantsRating.get(plantRatingInfo[0]).add(Double.parseDouble(plantRatingInfo[1]));
//                    break;
//
//                case "Update":
//                    String[] plantUpdate = input[1].split(" - ");
//                    String plant = plantUpdate[0];
//                    double newRarity = Integer.parseInt(plantUpdate[1]);
//
//                    if (plantsRarity.containsKey(plant)) {
//                        plantsRarity.put(plant, newRarity);
//                    } else {
//                        System.out.println("error");
//                    }
//                    break;
//
//                case "Reset":
//                    if (plantsRating.containsKey(input[1])) {
//                        plantsRating.get(input[1]).;
//                    }
//                    break;
//                default:
//                    System.out.println("error");
//            }
//
//            input = scan.nextLine().split(":");
//        }

        for (int i = 0; i < n; i++) {
            String[] plantText = scan.nextLine().split("<->");
            String plantName = plantText[0];
            int plantRarity = Integer.parseInt(plantText[1]);
            Plant newPlant = new Plant(new ArrayList<>(), plantRarity);
            currentPlants.put(plantName, newPlant);
        }

        String command = scan.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split(": | - ");
            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (!currentPlants.containsKey(plantName)) {
                command = scan.nextLine();
                System.out.println("error");
                continue;
            }

            switch (commandName) {
                case "Rate":
                    int currentRating = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).addRating(currentRating);
                    break;
                case "Update":
                    int currentRarity = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).setRarity(currentRarity);
                    break;
                case "Reset":
                    currentPlants.get(plantName).resetRating();
                    break;
                default:
                    System.out.println("error");
            }


            command = scan.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        currentPlants.entrySet().stream()
                .sorted((p1, p2) -> {
                    //Integer.compare - p2, p1 - descending
                    //Double.compare
                    //Сортираме редкостта низходящо
                    int result = Integer.compare(p2.getValue().getRarity(), p1.getValue().getRarity());
                    if (result == 0) {
                        //Ако две рядкости са равни, сортираме по усреднен рейтинг
                        result = Double.compare(p2.getValue().getAverage(), p1.getValue().getAverage());
                    }
                    return result;
                }).forEach(p -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", p.getKey(), p.getValue().getRarity(), p.getValue().getAverage()));
    }
}


class Plant {
    private List<Integer> ratings;
    private int rarity;

    public Plant(List<Integer> ratings, int rarity) {
        this.ratings = ratings;
        this.rarity = rarity;
    }

    public void addRating(int rating) {
        this.ratings.add(rating);
    }

    public void resetRating() {
        this.ratings.clear();
    }

    public double getAverage() {
        double sumOfAllRatings = 0;
        for (double rating : this.ratings) {
            sumOfAllRatings+= rating;
        }
        if (sumOfAllRatings == 0) {
            return 0;
        } else {
           return sumOfAllRatings / this.ratings.size();
        }
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getRarity() {
        return rarity;
    }
}