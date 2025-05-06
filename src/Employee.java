public class Employee {
    public Employee(int employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private final double hoursWorked;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
         double hoursWorked;
         if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
         } else {
             return 0;
         }

    }
}


