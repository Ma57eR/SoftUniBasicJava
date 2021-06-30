package Fundamentals.ExamsPrep;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Всеки ден грабят
        // всеки 3ти ден взимат 50% повеече от дневния грабеж
        //Всеки 5ти ден попадат на боен кораб и губят 30% от целия грабеж

        //Ако грабеното е равно или повече на таргета - да изписва "Ahoy! {totalPlunder} plunder gained."
        //Ако тотала е по-малък от таргета, да се изчисли процента - "Collected only {percentage}% of the plunder."
        //Double до 2ри знак

        int numOfDays = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double target = Double.parseDouble(scan.nextLine());
        double totalPlundered = 0;

        for (int day = 1; day <= numOfDays; day++) {
            totalPlundered += dailyPlunder;
            if (day % 3 == 0) {
                totalPlundered += (dailyPlunder * 0.50);
            } if (day % 5 == 0) {
                totalPlundered = totalPlundered * 0.70;
            }
        }
        if (totalPlundered >= target) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlundered);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", ((totalPlundered/target)*100));
        }


    }
}
