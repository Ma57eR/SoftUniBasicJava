package Fundamentals.Objects.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPersons = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < numOfPersons; i++) {
            String[] personData = scan.nextLine().split(" ");
            Person person = new Person(personData[0], Integer.parseInt(personData[1]));
            if (person.getAge() > 30) {
                personList.add(person);
            }
        }




        personList.sort(Comparator.comparing(Person::getName));

        for (Person person : personList) {
            System.out.printf("%s - %s%n", person.getName(), person.getAge());
        }

    }
}
