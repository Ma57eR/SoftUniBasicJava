package Fundamentals.Lists;

import java.util.*;

public class ListofProducts06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfProducts = Integer.parseInt(scan.nextLine());

        List<String> allProducts = new ArrayList<>();
        String product = "";
        for (int index = 0; index < numOfProducts; index++) {
                product = scan.nextLine();
                allProducts.add(product);
        }
        Collections.sort(allProducts);
        List<String> sortedProducts = new ArrayList<>();

        for (int index = 0; index < allProducts.size(); index++) {
            int number = index+1;
            String dot = number + ".";
            sortedProducts.add(index, dot + allProducts.get(index));
        }

        for (int i = 0; i < sortedProducts.size(); i++) {
            System.out.println(sortedProducts.get(i));
        }
    }
}
