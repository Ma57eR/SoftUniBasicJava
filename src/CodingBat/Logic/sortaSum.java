package CodingBat.Logic;

public class sortaSum {
    public static void main(String[] args) {

    }
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }

}
