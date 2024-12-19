import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    protected static double dailyWage=90.5;

    public Worker()
    {
    }
    public Worker(String name,String birthDate,String endDate)
    {
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public static double getDailyWage() {
        return dailyWage;
    }

    public LocalDate dateConverter(String date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endDate = LocalDate.parse(date, formatter);
        return endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public long getAge()
    {
        return ChronoUnit.DAYS.between(dateConverter(this.birthDate), LocalDate.now());
    }
    public void collectPay(String hireDate)
    {
    }
    public boolean terminate(String endDate)
    {
        return dateConverter(endDate).isBefore(LocalDate.now());
    }

}
