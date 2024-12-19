import java.time.temporal.ChronoUnit;

public class Employee extends Worker {
    private long employeeId;

    public String getHireDate() {
        return hireDate;
    }

    public static int getCount() {
        return count;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    private String hireDate;
    private static int count;


    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = count++;
        this.hireDate = hireDate;
    }
    public double collectPay()
    {
        return ChronoUnit.DAYS.between(dateConverter(this.hireDate), dateConverter(getEndDate()))*dailyWage;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} \n" + super.toString();
    }

}
