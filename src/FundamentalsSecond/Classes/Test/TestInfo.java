package FundamentalsSecond.Classes.Test;

public class TestInfo extends Test {
    String address;
    String phone;
    String dateOfBirth;

//    public TestInfo(String address, String phone, String dateOfBirth) {
//        this.address = address;
//        this.phone = phone;
//        this.dateOfBirth = dateOfBirth;
//    }

    public TestInfo(String name, String lastName, int age, long ssn, String address, String phone, String dateOfBirth) {
        super(name, lastName, age, ssn);
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;

    }
    static void printing(String name, String lastName, String address, String phone, String dateOfBirth, int age, long ssn) {
        System.out.println(name + " " + lastName + " " + address + " " + phone + " " + dateOfBirth + " " + age + " " + ssn);
    }
}
