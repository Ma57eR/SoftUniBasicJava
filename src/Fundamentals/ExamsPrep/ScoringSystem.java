package Fundamentals.ExamsPrep;

import java.util.*;

public class ScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());

        //Всяка лекция има допълнителен бонус
        //На всеки следващ ред се получават брой на присъствията на всеки студент
        List<Double> bonuses = new ArrayList<>();
        List<Integer> studentLectures = new ArrayList<>();
        double totalBonus;

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        for (int i = 0; i < numOfStudents; i++) {
            int attendance = Integer.parseInt(scan.nextLine());
            totalBonus = (double) attendance / lectures * (5 + (double) additionalBonus);
            bonuses.add(totalBonus);
            studentLectures.add(attendance);
        }
        double maxBonus = Collections.max(bonuses);
        int studentAttendance = 0;
        //maxBonus = bonuses.get(bonuses.size());
        studentAttendance = studentLectures.get(bonuses.indexOf(maxBonus));
        System.out.printf("Max Bonus: %d.%n", Math.round(maxBonus));
        System.out.printf("The student has attended %d lectures.", studentAttendance);

    }
}
