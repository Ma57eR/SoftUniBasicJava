package Fundamentals.Objects.Objects2.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] personInfo = scan.nextLine().split(" ");
            Person currentPerson = new Person(personInfo[0], Integer.parseInt(personInfo[1]));
            persons.add(currentPerson);
        }
        //stream Filter оставя само обектите, които отговарят на условията. Останалите се изтриват.
        persons = persons.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        persons.sort(Comparator.comparing(Person::getName));

        for (Person person : persons) {
        System.out.println(person.toString());
        }

    }
}
