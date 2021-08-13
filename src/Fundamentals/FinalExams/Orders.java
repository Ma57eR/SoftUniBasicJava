package Fundamentals.FinalExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Product name, price

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("buy")) {
            String productName = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);
            if (productsPrice.containsKey(productName)) {
                int totalQuantity = productsQuantity.get(productName) + quantity;
                productsQuantity.put(productName, totalQuantity);
                productsPrice.put(productName, price);
            } else {
                productsPrice.put(productName, price);
                productsQuantity.put(productName, quantity);
            }






            input = scan.nextLine().split(" ");
        }
            productsPrice.entrySet()
                    .forEach(product -> {
                        double totalProductPrice = product.getValue() *  productsQuantity.get(product.getKey());
                        System.out.printf("%s -> %.2f%n", product.getKey(), totalProductPrice);
                    });

    }
}
