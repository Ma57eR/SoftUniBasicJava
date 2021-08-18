package CodingBat.Logic;

public class squirrelPlay {
    public static void main(String[] args) {

    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer) {
            return temp >= 60 && temp <= 90;
        } else {
            return temp >= 60 && temp <= 100;
        }
    }
}
