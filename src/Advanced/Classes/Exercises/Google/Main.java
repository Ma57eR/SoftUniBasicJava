package Advanced.Classes.Exercises.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] command = scan.nextLine().split("\\s+");

        Map<String, Person> persons = new LinkedHashMap<>();

        while (!command[0].equals("End")) {
                //Person currentPerson = null;
            String name = command[0];
            switch (command[1]) {
                case "company":
                    String company = command[2];
                    String department = command[3];
                    double salary = Double.parseDouble(command[4]);
                    //Създаваме обект тип Компания
                    Company currentCompany = new Company(company, department, salary);
                    //Проверяваме дали имаме обект със същото име.
                    //Ако няма, създаваме го
                    persons.putIfAbsent(name, new Person(name));
                    //Взимаме обекта с това име и му добавяме компания.
                    persons.get(name).setCompany(currentCompany);
                    break;

                case "pokemon":
                    String pokeName = command[2];
                    String pokeType = command[3];
                    persons.putIfAbsent(name, new Person(name));
                    persons.get(name).setPokemons(pokeName, pokeType);
                    break;

                case "parents":
                    String parentName = command[2];
                    String parentBirthday = command[3];
                    Parents currentParents = new Parents(parentName, parentBirthday);
                    persons.putIfAbsent(name, new Person(name));
                    persons.get(name).getParents().add(currentParents);
                    break;

                case "children":
                    String childrenName = command[2];
                    String childrenBirthday = command[3];
                    Children currentChildren = new Children(childrenName, childrenBirthday);
                    persons.putIfAbsent(name, new Person(name));
                    persons.get(name).getChildren().add(currentChildren);
                    break;

                case "car":
                    String carModel = command[2];
                    int carSpeed = Integer.parseInt(command[3]);
                    Map<String, Integer> currentCar = new LinkedHashMap<>();
                    currentCar.put(carModel, carSpeed);
                    persons.putIfAbsent(name, new Person(name));
                    persons.get(name).setCar(currentCar);
                    break;
            }
        command = scan.nextLine().split("\\s+");
        }

        System.out.println();
    }
}

