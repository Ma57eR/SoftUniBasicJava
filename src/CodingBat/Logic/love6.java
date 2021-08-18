package CodingBat.Logic;

public class love6 {
    public static void main(String[] args) {

    }
    public boolean love6(int a, int b) {
        if (a + b == 6 || a / b == 6 || a * b == 6 || a % b == 6 || Math.abs(a - b) == 6 || a == 6 || b == 6) {
            return true;
        }
        return false;
    }

}
