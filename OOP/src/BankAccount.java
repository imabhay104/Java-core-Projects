public class BankAccount {
    private int accountNumber,phoneNo;
    private double accountBalance;
    private  String customerName;
    private String email;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Deposit(int accountNumber,double amount)
    {
        this.accountBalance+=amount;
    }
    public void Withdraw(int accountNumber,double amount)
    {
           if(this.accountBalance-amount<=0)
        {
            System.out.println("Withdraw unsuccesfull");
        }
        this.accountBalance-=amount;
    }
}
