package Advanced.Classes.Exercises.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] command = scan.nextLine().split("\\s+");

        Map<String, Person> persons = new LinkedHashMap<>();

        while (!command[0].equals("End")) {
            String name = command[0];
            String infoType = command[1];

            switch (infoType) {
                case "company":
                    String companyName = command[2];
                    String department = command[3];
                    double salary = Double.parseDouble(command[4]);
                    Company currentCompany = new Company(companyName, department, salary);

                    break;
                case "pokemon":
                    String pokeName = command[2];
                    String pokeType = command[3];
                    break;
                case "parents":
                    String parentName = command[2];
                    String parentBirthday = command[3];
                    break;
                case "children":
                    String childrenName = command[2];
                    String childrenBirtday = command[3];
                    break;
                case "car":
                    String carModel = command[2];
                    int carSpeed = Integer.parseInt(command[3]);
                    break;
            }



            command = scan.nextLine().split("\\s+");
        }
    }
}
