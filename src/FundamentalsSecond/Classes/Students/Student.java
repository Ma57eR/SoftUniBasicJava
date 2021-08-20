package FundamentalsSecond.Classes.Students;

public class Student {
    String first_name;
    String last_name;
    int age;
    String hometown;

    public Student(String first_name, String last_name, int age, String hometown) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
