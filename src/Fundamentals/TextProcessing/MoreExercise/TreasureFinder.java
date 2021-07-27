package Fundamentals.TextProcessing.MoreExercise;

import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String key[] = scan.nextLine().split(" ");

        String input = scan.nextLine();

        while (!input.equals("find")) {
            int keyIndex = 0;
            StringBuilder decrypted = new StringBuilder();
            for (int ch = 0; ch < input.length(); ch++) {
                //Проверяваме дали индекса е по-голям от дължината на ключа
                //Ако е по-голям, делим с остатък на дължината на ключа
                if (ch >= key.length) {
                    keyIndex = ch % key.length;
                } else {
                    keyIndex = ch;
                }
                //Декодираме символа и го добавяме в СтрингБилдера
                char decryptedChar = (char) (input.charAt(ch) - Integer.parseInt(key[keyIndex]));
                decrypted.append(decryptedChar);
            }
            //Изваждаме името на съкровището
            int nameStartIndex = decrypted.indexOf("&")+1;
            int nameEndIndex = decrypted.lastIndexOf("&");
            String treasureName = decrypted.substring(nameStartIndex, nameEndIndex);

            int coordsStartIndex = decrypted.indexOf("&")+1;
            int coordsEndIndex = decrypted.charAt(decrypted.length()-1);
            String treasureCoords = decrypted.substring(coordsStartIndex, coordsEndIndex);

            System.out.printf("Found %s at %s", treasureName, treasureCoords);
            input = scan.nextLine();
        }

    }
}
