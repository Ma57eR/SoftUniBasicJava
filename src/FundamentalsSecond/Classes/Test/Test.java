package FundamentalsSecond.Classes.Test;

public class Test {
    String name;
    String lastName;
    int age;
    long ssn;

    public Test() {
    }

    public Test(String name, String lastName, int age, long ssn) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    static void isYoung(String name, int age, String oldOrYoung) {
        String howOld = "";
        if (age > 20) {
            System.out.println("Old");
        } else {

        System.out.println("Young");
        }
    }

}
