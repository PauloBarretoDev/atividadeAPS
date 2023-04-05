package Q4;

public class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;
    private double salary;
    private double tax;
    private double netSalary;
    private double taxRate = 0.2;

    public Employee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateBaseSalary() {
        this.salary = hourlyRate * hoursWorked;
    }

    public void calculateTax() {
        this.tax = this.salary * taxRate;
    }

    public void calculateNetSalary() {
        this.netSalary = this.salary - this.tax;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nGross salary: " + this.salary +
                "\nTax (20%): " + this.tax +
                "\nNet Salary: " + this.netSalary;
    }
}
