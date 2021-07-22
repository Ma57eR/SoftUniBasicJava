package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Courses2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(" : ");

        while (!input[0].equals("end")) {
            String course = input[0];
            String name = input[1];

            boolean isCourseExist = isCourseExist(courses, course);
            if (!isCourseExist) {
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(name);
            input = scan.nextLine().split(" : ");
        }
        courses
                .entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue().size(), o1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(name -> System.out.println("-- "+  name));
                } );


    }

    private static boolean isCourseExist(Map<String, List<String>> courses, String course) {
        return courses.containsKey(course);
    }


}
