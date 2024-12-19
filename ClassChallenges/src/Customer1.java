public class Customer1 {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    Customer1(String name,
    double creditLimit,
    String emailAddress)
    {
        this.name=name;
        this.emailAddress=emailAddress;
        this.creditLimit=creditLimit;
    }

    Customer1()
    {
        new Customer1("abhay",1.0,"abshinde104@gmail.com");
    }


}
