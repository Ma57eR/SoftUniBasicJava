package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!input[0].equals("buy")) {
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);

            if (!productPrice.containsKey(product)) {
                productPrice.put(product, price);
                productQuantity.put(product, quantity);
            } else {
                //Взимаме количеството, което е в количката и добавяме новото
                int tmpQuantity = productQuantity.get(product) + quantity;
                productQuantity.put(product, tmpQuantity);
                productPrice.put(product, price);
            }
            input = scan.nextLine().split(" ");
        }

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            //Пресмятаме общата цена за всеки продукт
            double totalPrice = entry.getValue() * productPrice.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }


    }

}
