package Advanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //&quot;Revision&quot;

        String input = scan.nextLine();

        Map<String, Map<String, Double>> productsInfo = new TreeMap<>();
        while (!input.equals("Revision")) {

            String[] tokens = input.split(" ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);



            productsInfo.putIfAbsent(shop, new LinkedHashMap<>());
            productsInfo.get(shop).put(product, price);


            input = scan.nextLine();
        }
            productsInfo.entrySet().forEach(s -> {
                System.out.println(s.getKey() + "->");
                s.getValue().entrySet()
                        .forEach(prod -> {
                            System.out.printf("Product: %s, Price: %.1f%n", prod.getKey(), prod.getValue());
                        });
            });
    }
}
