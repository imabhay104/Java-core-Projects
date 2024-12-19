import java.time.temporal.ChronoUnit;

public class SalariedEmployee extends Employee {
private double annualSalary;
private boolean isRetired;

public SalariedEmployee(String name, String birthDate, String endDate, String hireDate)
{
    super(name,birthDate,endDate,hireDate);
    this.annualSalary=getAnnualSalary();
    this.isRetired=retire();
}

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} \n" + super.toString();
    }

    public boolean retire()
{
    return terminate(this.endDate);
    //if(this.isRetired) System.out.println(this.getName()+"is not retired\n");
    //else System.out.println(this.getName()+"is retired\n");
}
public double getAnnualSalary()
{
    return ChronoUnit.DAYS.between(dateConverter("2024-01-01"), dateConverter(getEndDate()))*dailyWage;

}


}
