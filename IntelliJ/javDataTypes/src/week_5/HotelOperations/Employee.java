package week_5.HotelOperations;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double overTimeHours;
    private double regularHours;
    private boolean punch;
    private double startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        totalPay();
    }

    public double totalPay(){
        double total;
        if(getHoursWorked() > 40) {
            this.overTimeHours = getHoursWorked() - 40;
            total = (overTimeHours * (getPayRate() * 1.5)) + (getPayRate() * (this.hoursWorked - overTimeHours));
        } else {
            total = (this.getPayRate() * this.getHoursWorked());
        }
        return total;
    }

        public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {

    }
}
