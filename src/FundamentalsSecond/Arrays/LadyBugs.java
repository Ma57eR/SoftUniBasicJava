package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int field = Integer.parseInt(scan.nextLine());
        String[] initialIndexes = scan.nextLine().split(" ");
        int[] ladyBugs = new int[field];

        //Добавяме
        for (int i = 0; i < initialIndexes.length; i++) {
            int currentIndex = Integer.parseInt(initialIndexes[i]);
            if (currentIndex < field) {
                ladyBugs[currentIndex] = 1;
            }
        }
        String[] commands = scan.nextLine().split(" ");

        while (!commands[0].equals("end")) {
            if (commands.length == 3) {

                int ladyIndex = Integer.parseInt(commands[0]);
                String direction = commands[1];
                int indexes = Integer.parseInt(commands[2]);

                switch (direction) {
                    case "right":
                        //Проверка дали индекса за калинка е в пределите на масива и дали има калинка на индекса
                        if (ladyIndex < ladyBugs.length && ladyBugs[ladyIndex] == 1 && indexes != 0) {
                            int newIndex = ladyIndex + indexes;
                            //Ако новия индекс е в пределите
                            if (newIndex < ladyBugs.length) {
                                ladyBugs[ladyIndex] = 0;
                                if (indexes >= 0) {
                                    //Проверяваме дали полето е свободно
                                    for (int i = newIndex; i < ladyBugs.length; i += indexes) {
                                        if (ladyBugs[i] == 0) {
                                            ladyBugs[i] = 1;
                                            break;
                                        }
                                    }
                                } else {
                                    //Проверяваме дали полето е свободно
                                    for (int i = newIndex; i >= 0; i += indexes) {
                                        if (ladyBugs[i] == 0) {
                                            ladyBugs[i] = 1;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                ladyBugs[ladyIndex] = 0;
                            }
                        }
                        break;
                    case "left":
                        //Проверка дали индекса за калинка е в пределите на масива и дали има калинка на индекса
                        if (ladyIndex < ladyBugs.length && ladyBugs[ladyIndex] == 1 && indexes != 0) {
                            int newIndex = ladyIndex - indexes;
                            //Ако новия индекс е в пределите
                            if (newIndex >= 0) {
                                ladyBugs[ladyIndex] = 0;
                                if (indexes >= 0) {
                                    //Проверяваме дали полето е свободно
                                    for (int i = newIndex; i >= 0; i -= indexes) {
                                        if (ladyBugs[i] == 0) {
                                            ladyBugs[i] = 1;
                                            break;
                                        }
                                    }
                                } else {
                                    //Проверяваме дали полето е свободно
                                    for (int i = newIndex; i < ladyBugs.length; i += indexes) {
                                        if (ladyBugs[i] == 0) {
                                            ladyBugs[i] = 1;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                ladyBugs[ladyIndex] = 0;
                            }
                        }

                        break;
                }
            }

            commands = scan.nextLine().split(" ");
        }

        for (int ladyBug : ladyBugs) {
            System.out.print(ladyBug + " ");
        }
    }
}
