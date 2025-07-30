package firstpackage;

public class Employee {

    protected int empNo;
    protected String name;
    protected double salary;

    public Employee(int empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}