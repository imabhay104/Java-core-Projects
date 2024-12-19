public class Customer {

    Customer(String name, Double creeditLimit, String email)
    {
        this.name=name;
        this.creeditLimit=creeditLimit;
        this.email=email;
    }
    Customer()
    {
        this("Default",10000.0,"default@gmail.com");
    }
    Customer(String email)
    {
        this("Default",10000.0,email);  
    }
     String name;
    Double creeditLimit;
    int abhay;
    String email;
    int no;
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getCreeditLimit() {
        return creeditLimit;
    }
    
}

