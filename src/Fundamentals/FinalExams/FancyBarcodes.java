package Fundamentals.FinalExams;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfBarcodes = Integer.parseInt(scan.nextLine());
        String productRegex = "@#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern barcodePattern = Pattern.compile(productRegex);
        String productGroupRegex = "[0-9]*";
        Pattern productGroup = Pattern.compile(productGroupRegex);

        for (int i = 0; i < numOfBarcodes; i++) {
            String barcode = scan.nextLine();
            Matcher barcodeMatcher = barcodePattern.matcher(barcode);
            StringBuilder currentProduct = new StringBuilder();
            //Добавяме името на продукта
            while (barcodeMatcher.find()) {
                currentProduct.append(barcodeMatcher.group("product"));
            } //Проверка дали има име - ако няма, значи е невалиден баркода
            if (currentProduct.length() == 0) {
                System.out.println("Invalid barcode");
            } else {
                Matcher productGroupMatcher = productGroup.matcher(barcode);
                StringBuilder currentProductGroup = new StringBuilder();
                while (productGroupMatcher.find()) {
                    currentProductGroup.append(productGroupMatcher.group());
                }//Ако няма цифри в баркода, за да ги ползваме за група, пишем 00
                if (currentProductGroup.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + currentProductGroup);
                }
            }
        }
    }
}
