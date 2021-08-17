package Fundamentals.AssociativeArrays.SecondSolutions;

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
                ladyBugs[i] = 1;
            }
        }
        String[] commands = scan.nextLine().split(" ");

        while (!commands[0].equals("end")) {
            int ladyIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int indexes = Integer.parseInt(commands[2]);

            switch (direction) {
                case "right":
                    //Проверка на индекса за калинка
                    if (ladyIndex < ladyBugs.length) {
                        //Провека има ли калинка
                        if (ladyBugs[ladyIndex] == 1) {
                            int newIndex = ladyIndex + indexes;
                            //Новия индекс валиден ли е?
                            if (newIndex < ladyBugs.length) {
                                //Има ли калинка на следващия индекс
                                if (ladyBugs[newIndex] == 0) {
                                    //Махаме я от стария индекс и я слагаме на новия
                                    ladyBugs[ladyIndex] = 0;
                                    ladyBugs[newIndex] = 1;
                                } else {
                                    ladyBugs[ladyIndex] = 0;
                                    for (int i = ladyIndex+newIndex; i < ladyBugs.length; i+=newIndex) {
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
                    }
                    break;
                case "left":
                    //Проверка на индекса за калинка
                    if (ladyIndex >= 0) {
                        //Провека има ли калинка
                        if (ladyBugs[ladyIndex] == 1) {
                            int newIndex = ladyIndex - indexes;
                            //Новия индекс валиден ли е?
                            if (newIndex >= 0) {
                                //Има ли калинка на следващия индекс
                                if (ladyBugs[newIndex] == 0) {
                                    //Махаме я от стария индекс и я слагаме на новия
                                    ladyBugs[ladyIndex] = 0;
                                    ladyBugs[newIndex] = 1;
                                } else {
                                    ladyBugs[ladyIndex] = 0;
                                    for (int i = ladyIndex-newIndex; i >= 0; i-=newIndex) {
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
                    }
                    break;
            }

            commands = scan.nextLine().split(" ");
        }

        for (int ladyBug : ladyBugs) {
            System.out.print(ladyBug + " ");
        }
    }
}
