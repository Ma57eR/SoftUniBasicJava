package Advanced.Classes.Exercises.Google;

public class Company {
    private String company;
    private String department;
    private double salary;

    public Company(String company, String department, double salary) {
        this.company = company;
        this.department = department;
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
