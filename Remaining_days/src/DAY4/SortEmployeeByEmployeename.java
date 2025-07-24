package DAY4;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class SortEmployeeByEmployeename {
	public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Prasad", 1));
        employeeList.add(new Employee("Mahesh", 2));
        employeeList.add(new Employee("Tharun", 3));
        employeeList.add(new Employee("Sanju", 4));
        employeeList.add(new Employee("Revanth", 5));

        System.out.println("Before sorting the employee by name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        employeeList.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

        System.out.println("\nBefore sorting the employee by name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

