import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions=new ArrayList<>();
        this.transactions.add(200d);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public double getBalance() {
        double sum=0;
        for (double value:transactions)
        {
            sum=sum+value;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Transactions: " + transactions+" Balance:" +
                getBalance();
    }
}
