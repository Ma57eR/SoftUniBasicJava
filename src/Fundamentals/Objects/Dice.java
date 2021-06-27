package Fundamentals.Objects;

import java.util.Random;

public class Dice {

    private int sides; // Няма да бъде видим извън този клас
    String color;
    int size;

    public int getSides() {
        return sides;
    }

    public void setSides(int number) {
        if (number < 1) {
            sides = 1;
        } else {
            sides = number;
        }
    }

    int roll() {
        Random random = new Random();
        int number = random.nextInt(sides) + 1;
        return number;
    }

}
