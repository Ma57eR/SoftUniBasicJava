package FundamentalsSecond.Classes.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test("Ivan", "Ivanov", 20, 830218644);
        Test test2 = new Test("Ivan", "Ivanov", 25, 820218644);
        Test test3 = new Test("Ivan", "Ivanov", 19, 810218644);

        Test.isYoung(test2.name, test2.age, "");

        TestInfo testInfo = new TestInfo("Ivan", "Ivanov", 20, 829302203, "София, Надежда", "089825856", "01.01.2020");

        TestInfo.printing(testInfo.name, testInfo.lastName, testInfo.address, testInfo.phone, testInfo.dateOfBirth, testInfo.age, testInfo.ssn);
    }
}
