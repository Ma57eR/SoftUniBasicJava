package Advanced.Classes.Exercises.CompanyRoster;

public class Department {
    private String department;
    private double salary;
    private int numOfEmployees;
    private double averageSalary;

    public Department(String department, double salary, int count) {
        this.department = department;
        this.salary = salary;
        this.numOfEmployees = count;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public double getSalary() {
        return salary;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }
}
