package prog3;
class Employee {
    private String name;
    private double salary;
    public void setName(String n) {
        name = n;
    }
    public void setSalary(double s) {
        salary = s;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}
public class EncapsulationExample {
	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Tharun");
        emp.setSalary(75000);
        emp.display();
    }
}

