package Advanced.Classes.Exercises.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Department> departments = new LinkedList<>();
        List<Employee> employees = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Employee currentEmployee = null;
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            if (tokens.length == 4) {
                currentEmployee = new Employee(name, salary, position, department);
            }

            if (tokens.length == 5) {
                if (tokens[4].contains("@")) {
                    String email = tokens[4];
                    currentEmployee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(tokens[4]);
                    currentEmployee = new Employee(name, salary, position, department, age);
                }
            }
            if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                currentEmployee = new Employee(name, salary, position, department, email, age);
            }
            employees.add(currentEmployee);
            Department currentDepartment = new Department(department, salary, 1);
            if (!departments.isEmpty()) {
                updateDepartment(departments, salary, currentDepartment);
            } else {
                departments.add(currentDepartment);
            }


        }

        double highestSalary = 0;
        String bestDepart = null;

        for (Department department1 : departments) {
            if (department1.getSalary() / department1.getNumOfEmployees() > highestSalary) {
                bestDepart = department1.getDepartment();
                highestSalary = department1.getSalary() / department1.getNumOfEmployees();
            }
        }

        String finalBestDepart = bestDepart;

        employees.sort(Comparator.comparing(Employee::getSalary).reversed());

        System.out.println("Highest Average Salary: " + bestDepart);

        for (Employee employee : employees) {
            if (employee.getDepartment().equals(bestDepart)) {
                System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
            }
        }

    }

//    private static boolean departmentAverageSalary(Department department1, double highestAverage) {
//        //Проверка дали конркетния отдел има по-висока средна заплата
//        return ;
//    }

    private static void updateDepartment(List<Department> departments, double salary, Department currentDepartment) {
        boolean isExist = false;
        for (Department department : departments) {
            if (department.getDepartment().equals(currentDepartment.getDepartment())) {
                department.setSalary(department.getSalary() + salary);
                department.setNumOfEmployees(department.getNumOfEmployees() + 1);
                isExist = true;
            }
        }
        if (!isExist) {
            departments.add(currentDepartment);
        }
    }
}
