package CodingBat.Logic;

public class alarmClock {
    public static void main(String[] args) {

    }

    public int maxMod5(int a, int b) {
        int sum = a + b;
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        String sSum = String.valueOf(sum);
        if(sA.length() == sSum.length()){
            return sum;
        }
        return a;
    }



}
