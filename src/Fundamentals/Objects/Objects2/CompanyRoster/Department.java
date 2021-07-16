package Fundamentals.Objects.Objects2.CompanyRoster;

public class Department {
    String department;
    double salary;
    int numOfEmployees;
    double averageSalary;

    public Department(String department, double salary, int numOfEmployees) {
        this.department = department;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public double getAverageSalary() {
        return averageSalary;
    }
}
