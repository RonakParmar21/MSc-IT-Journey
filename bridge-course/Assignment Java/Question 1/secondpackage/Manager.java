package secondpackage;

import firstpackage.Employee;

public class Manager extends Employee {
private String deptName;
    private double incentive;

    public Manager(int empNo, String name, double salary, String deptName, double incentive) {
        super(empNo, name, salary);
        this.deptName = deptName;
        this.incentive = incentive;
    }

    public double getGrossSalary() {
        return salary + incentive;
    }

    public void displayDetails() {
        super.display();
        System.out.println("Department: " + deptName);
        System.out.println("Incentive: " + incentive);
        System.out.println("Gross Salary: " + getGrossSalary());
    }
}