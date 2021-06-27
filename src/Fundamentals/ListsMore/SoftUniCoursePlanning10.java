package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        List<String> changes = Arrays.stream(scan.nextLine().split(":")).collect(Collectors.toList());

        while (!changes.get(0).equals("course start")) {

            switch (changes.get(0)) {
                case "Add":
                    //Добавяме урок накрая, ако не съществува в програмата
                    if (isLessonExist(schedule, changes)) {
                        schedule.add(changes.get(1));
                    }
                    break;
                case "Insert":
                    if (isLessonExist(schedule, changes)) {
                        schedule.add(Integer.parseInt(changes.get(2)), changes.get(1));
                    }
                    break;
                case "Remove":
                    if (!isLessonExist(schedule, changes)) {
                        schedule.remove(changes.get(1));
                    }
//                    List<Integer> indexes = isExerciseExist(schedule,changes);
//                    if (indexes.size() > 0) {
//                        for (int i = 0; i < indexes.size()-1; i++) {
//                            schedule.remove(indexes.get(i));
//                        }
//
//                    }
                    break;
                case "Swap":
                    if (schedule.contains(changes.get(1)) && schedule.contains(changes.get(2))) {
                        String temp = changes.get(1);
                        int oldindex = schedule.indexOf(changes.get(2));
                        schedule.set(schedule.indexOf(changes.get(1)), changes.get(2));
                        schedule.set((oldindex), temp);

//                        if (schedule.contains(changes.get(2)) && schedule.contains("Exercise")) {
//
//                        }

                        int count = 0;
                        for (int i = 0; i < schedule.size(); i++) {
                            if (schedule.get(i).contains(changes.get(2))) {
                                count++;
                            }

                        }
                        if (count > 1) {
                            oldindex+=1;
                            temp = schedule.get(oldindex);
                            schedule.remove(temp);
                            schedule.add((schedule.indexOf(changes.get(2))+1), temp);

                        }
                    }
                    break;
                case "Exercise":

                    if (schedule.contains(changes.get(1))) {
                        int indexOfLesson = 0;
                        indexOfLesson = schedule.indexOf(changes.get(1));
                        schedule.add(indexOfLesson + 1, changes.get(1) + "-Exercise");
                    } else {
                        schedule.add(changes.get(1));
                        schedule.add(changes.get(1) + "-Exercise");
                    }
                    //TODO: В случаите, които имаме SWAP, ако при Lesson има Exercise, да се премества и той
                    break;
            }
            changes = Arrays.stream(scan.nextLine().split(":")).collect(Collectors.toList());
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(i + 1 + "." +schedule.get(i));
        }

    }


    private static boolean isLessonExist(List<String> schedule, List<String> changes) {
        boolean existingLeson = false;
        if (!schedule.contains(changes.get(1))) {
           existingLeson = true;
        }
        return existingLeson;
    }
}
