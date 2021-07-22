package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;


public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> courses = new LinkedHashMap<>(); // Key = Courses, Value = Students
        Map<String, String> students = new TreeMap<>(); //Key = StudentName, Value = Course
        String[] input = scan.nextLine().split(" : ");

        while (!input[0].equals("end")) {
            String course = input[0];
            String student = input[1];
            boolean isCourseExist = isCourseExist(courses, course);

            if (!isCourseExist) {
                courses.put(course, 1);
            } else {
                int studentsNum = courses.get(course) + 1;
                courses.put(course, studentsNum);
            }
            students.put(student, course);
            input = scan.nextLine().split(" : ");
        }

        courses
                .entrySet()
                .stream()
                //сорт - курсовете в низходящ ред по броя записани
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                //Минаваме през всеки курс
                .forEach(entry -> {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                            students
                                    .entrySet()
                                    //Принтираме всеки студент от конкретния курс
                                    .forEach(student ->
                                    {
                                        if (student.getValue().equals(entry.getKey())) {
                                            System.out.println("-- " + student.getKey());
                                        }
                                    });
                        }
                );
    }

    private static boolean isCourseExist(Map<String, Integer> courses, String course) {
        return courses.containsKey(course);
    }
}
