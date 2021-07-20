package Fundamentals.Objects.Objects2.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfEmployees = Integer.parseInt(scan.nextLine());
        //Да се намери отдела с най-висока средна заплата
        List<Employee> employees = new ArrayList<>();
        List<Department> depart = new ArrayList<>();
        String email = "";
        int age = 0;
        for (int i = 0; i < numOfEmployees; i++) {
            int numInDepart = 1;
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            //Проверяваме дали на входя има мейл
            if (input.length > 4 && input[4].indexOf('@') >= 0) {
                email = input[4];
            } else {
                email = "n/a";
            }
            //Проверяваме дали няма мейл
            if (input[input.length - 1].indexOf('@') == -1 && input.length > 4) {
                age = Integer.parseInt(input[input.length - 1]);
            } else {
                age = -1;
            }
            //Добавяме информацията за обекта
            Employee currentEmployee = new Employee(name, salary, position, department, email, age);
            employees.add(currentEmployee);
            Department currentDepartment = new Department(department, salary, numInDepart);
            boolean departExist = false;
            //Проверка дали информацията за отдела същестува и добавяме броя служители в него, както и общата им заплата
            for (Department department1 : depart) {
                if (currentDepartment.department.equals(department1.getDepartment())) {
                    department1.setSalary(department1.salary + salary);
                    department1.setNumOfEmployees(department1.getNumOfEmployees() + 1);
                    departExist = true;
                }
            }
            if (!departExist) {
                depart.add(currentDepartment);
            }
        }
        //Изчисляваме средната заплата за всеки отдел
        for (Department department : depart) {
            department.setAverageSalary(department.getSalary()/department.getNumOfEmployees());
        }
        String bestDepart = "";
        //Сортираме отделите по средна заплата
        depart.sort(Comparator.comparing(Department::getAverageSalary).reversed());
        for (int i = 0; i < 1; i++) {
           bestDepart = depart.get(i).getDepartment();
        }
        System.out.println("Highest Average Salary: " + bestDepart);
        //Сортираме по размер на заплатата
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        //Принтираме служителите от отдела с най-висока средна заплата
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(bestDepart)) {
                System.out.println(employee.toString());
            }
        }
    }
}
