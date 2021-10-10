package Advanced.OldExams;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> liquids = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> ingredients = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Map<String, Integer> foodList = new LinkedHashMap<>();

        foodList.put("Biscuit", 25);
        foodList.put("Cake", 50);
        foodList.put("Pie", 75);
        foodList.put("Pastry", 100);

        Map<String, Integer> cookedFood = new LinkedHashMap<>();
        cookedFood.put("Biscuit", 0);
        cookedFood.put("Cake", 0);
        cookedFood.put("Pie", 0);
        cookedFood.put("Pastry", 0);




        for (int liquid = 0; liquid < liquids.size(); liquid++) {
            for (int ingredient = ingredients.size() - 1; ingredient >= 0; ingredient--) {
                //cook(liquids, ingredients, foodList, cookedFood, liquid, ingredient);
                int mix = 0;
                if (liquids.isEmpty()) {
                    break;
                }
                mix = liquids.get(liquid) + ingredients.get(ingredient);

                boolean cooked = false;
                for (Map.Entry<String, Integer> food : foodList.entrySet()) {
                    if (food.getValue() == mix) {
                        //Ако го няма това ястие го добавяме
                        cookedFood.putIfAbsent(food.getKey(), 0);
                        //Добавяме +1 пъти, че е готвено
                        cookedFood.put(food.getKey(), cookedFood.get(food.getKey()) + 1);
                        liquids.remove(liquids.get(liquid));
                        ingredients.remove(ingredients.get(ingredient));
                        cooked = true;
                        break;
                    }
                }
                if (!cooked) {
                    liquids.remove(liquid);
                    int addingIngredient = ingredients.get(ingredient) + 3;
                    ingredients.set(ingredient, addingIngredient);
                    ingredient++;

                }
            }
        }
        boolean allCooked = true;
        for (Integer value : cookedFood.values()) {
            if (value == 0) {
                allCooked = false;
                break;
            }
        }
        System.out.println();
        if (allCooked) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
            for (String allFood : foodList.keySet()) {
                cookedFood.putIfAbsent(allFood, 0);
            }
        }
        if (liquids.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            String liquidsOutput = liquids.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")).toString();
            System.out.println(liquidsOutput);
        }
        if (ingredients.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            Collections.sort(ingredients);
            String ingredientsOutput = ingredients.stream()
                    .map(Objects::toString)
                    .collect(Collectors.joining(", ")).toString();
            System.out.println(ingredientsOutput);
        }



        for (Map.Entry<String, Integer> cooked : cookedFood.entrySet()) {
            System.out.println(cooked.getKey() + ": "+ cooked.getValue());
        }

    }

}
