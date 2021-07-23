package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companyInfo = new TreeMap<>();
        String[] input = scan.nextLine().split(" -> ");

        while (!input[0].equals("End")) {
            String company = input[0];
            String employee = input[1];
            //Ако компанията не съществува
            if (!companyInfo.containsKey(company)) {
                companyInfo.put(company, new ArrayList<>());
                companyInfo.get(company).add(employee);
            }
            //Ако юзъра съществува, но компанията не
            if (!companyInfo.get(company).contains(employee)) {
                companyInfo.get(company).add(employee);
            }

            input = scan.nextLine().split(" -> ");
        }

        for (Map.Entry<String, List<String>> company : companyInfo.entrySet()) {
            System.out.println(company.getKey());
            for (int i = 0; i < company.getValue().size(); i++) {
                System.out.println("-- " + company.getValue().get(i));
            }
        }
    }

}

