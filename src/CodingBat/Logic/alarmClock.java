package CodingBat.Logic;

public class alarmClock {
    public static void main(String[] args) {

    }
    public String alarmClock(int day, boolean vacation) {
        String alarm = "";
        if (!vacation) {
            if (day > 0 && day < 6) {
                alarm = "7:00";
            } else {
                alarm = "10:00";
            }
        } else {
            if (day > 0 && day < 6) {
                alarm = "10:00";
            } else {
                alarm = "off";
            }
        }
        return alarm;
    }

}
