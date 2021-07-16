package Fundamentals.Objects.Objects2.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Person> people = new ArrayList<>();

        while (!input[0].equals("End")) {
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);

            Person currentPerson = new Person(name, id, age);
            people.add(currentPerson);
            input = scan.nextLine().split("\\s+");
        }
        people.sort(Comparator.comparing(Person::getAge));
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
