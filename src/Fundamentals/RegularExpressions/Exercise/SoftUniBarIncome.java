package Fundamentals.RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(%)(?<name>[A-Z][a-z]+)\\1[^%|$.]*<(?<product>\\w+)>[^\\%\\|\\$\\.]*(\\|)(?<quantity>[0-9]*)\\4[^\\%\\|\\$\\.]*?(?<price>\\d+.?\\d*)\\$";

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher customerMatch = pattern.matcher(input);

            StringBuilder customer = new StringBuilder();
            StringBuilder product = new StringBuilder();
            StringBuilder quantity = new StringBuilder();
            StringBuilder currentPrice = new StringBuilder();
            while (customerMatch.find()) {
                customer.append(customerMatch.group("name"));
                product.append(customerMatch.group("product"));
                quantity.append(customerMatch.group("quantity"));
                currentPrice.append(customerMatch.group("price"));
                double price = Double.parseDouble(quantity.toString()) * Double.parseDouble(currentPrice.toString());
                totalIncome += price;
                System.out.printf("%s: %s - %.2f%n", customer, product, price);
            }


            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
