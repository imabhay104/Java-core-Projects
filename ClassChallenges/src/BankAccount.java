public class BankAccount {
    public BankAccount(){
        this(1,1,1,"Abhay","a@gmail.com");
    }
    public BankAccount(int accountNumber, long phoneNo,double accountBalance,String customerName,String email)
    {
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.phoneNo=phoneNo;
        this.email=email;   
    }
    public BankAccount(long phoneNo, double accountBalance) {
        this.phoneNo = phoneNo;
        this.accountBalance = accountBalance;
    }
    private int accountNumber;
    private long phoneNo;
    private double accountBalance;
    private  String customerName;
    private String email;
    public int getAccountNumber() {
        return accountNumber;
    }
    public long getPhoneNo() {
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
    public void setPhoneNo(long phoneNo) {
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
        System.out.println("Deposit Successful\nNew balance for account No: "+this.getAccountNumber()+" is "+getAccountBalance());
    }
    public boolean Withdraw(int accountNumber,double amount)
    {
        if(this.accountBalance-amount<=0)
        {
            System.out.println("Withdraw unsuccesfull");
            return false;
        }
        else {
            this.accountBalance -= amount;
            System.out.println("Withdraw Successful\nNew balance for account No: " + this.getAccountNumber() + " is " + getAccountBalance());
            return true;
        }
    }
    public void Balance(int accountNumber)
    {
        System.out.println("Your account balance is : "+ this.getAccountBalance());
    }
}