import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customersList;

    public Bank(String name) {
        this.name = name;
        this.customersList = new ArrayList<>();  // Initialize customersList
    }
    public void addCustomer(String name)
    {
        Customer customer=new Customer(name);
        customersList.add(customer);
        System.out.println("Added customer: " + customer);
    }
    public void addTransaction(String name,double value)
    {
        //int index=customersList.indexOf(name);
      //  customersList.get(index).getTransactions().add(value);
        for (Customer customer: customersList)
        {
            if(customer.getName().equalsIgnoreCase(name))
            {
                customer.getTransactions().add(value);
                System.out.println(this);

            }
        }

    }


    @Override
    public String toString() {
        return "Bank: " + name + ", Customers: " + customersList
                ;

    }
}
