package airport;

public class Employee extends Person {
    private int employeeId;
    private double salary;


    public Employee(String firstName, String lastName, int employeeId, double salary) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
