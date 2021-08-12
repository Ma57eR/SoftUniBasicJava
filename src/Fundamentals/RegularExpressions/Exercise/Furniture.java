package Fundamentals.RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //">>{furniture name}<<{price}!{quantity}" - Valid input
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);


        double totalPrice = 0;
        List<String> furnitures = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                furnitures.add(matcher.group("furniture"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalPrice += Double.parseDouble(matcher.group("price")) * quantity;
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture: ");
        furnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
