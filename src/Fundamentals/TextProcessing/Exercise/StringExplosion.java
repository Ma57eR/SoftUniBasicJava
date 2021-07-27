package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        //Ако намерим знак '>' след него има цифра, която обозначава символите, които трябва да изтрием.
        char[] arrText = new char[input.length()];
        StringBuilder text = new StringBuilder();

        //Пълним масива със символите от инпут
        for (int i = 0; i < input.length(); i++) {
            arrText[i] = input.charAt(i);
        }
        int boomPower = 0;
        for (int index = 0; index < arrText.length; index++) {

            //Ако трябва да гърмим и нямаме следаваща мина
            if (boomPower > 0 && arrText[index] != '>') {
                boomPower--;
                continue;
            }
            //Ако трябва да гърмим и имаме следаваща мина
            if (boomPower > 0 && arrText[index] == '>') {
                boomPower += Integer.parseInt(String.valueOf(arrText[index + 1]));
                text.append(arrText[index]);
                continue;
            }
            //Ако символа не е за гърмеж и не е цифра
            if (arrText[index] != '>' && !Character.isDigit(arrText[index])) {
                text.append(arrText[index]);
            }
            //Ако символа е за гърмеж
            if (arrText[index] == '>') {
                boomPower += Integer.parseInt(String.valueOf(arrText[index + 1]));
                text.append(arrText[index]);
            }
            //Ако имаме да гърмим и имаме цифра
            if (Character.isDigit(arrText[index]) && boomPower > 0) {
                boomPower--;
            }

        }
        System.out.println(text);
    }
}
