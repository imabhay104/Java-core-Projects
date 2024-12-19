import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Abhay Bank\nIf existing customer, Please enter account number(4 Digit)\nIf new,Please enter 1 to create new account\n");
        String response = scanner.nextLine();
        if (Integer.parseInt(response) == 1) {
            BankAccount bankAccount = new BankAccount(1001, 994591515, 0.0, "Abhay Shinde", "abshinde104@gmail.com");
            System.out.println("Welcome to Abhay Bank\nPlease Enter accountNumber,customerName,email,phoneNo");
            bankAccount.setAccountNumber(Integer.parseInt(scanner.nextLine()));
            bankAccount.setCustomerName(scanner.nextLine());
            bankAccount.setEmail(scanner.nextLine());
            bankAccount.setPhoneNo(Long.parseLong(scanner.nextLine()));
            bankAccount.Balance(bankAccount.getAccountNumber());
            System.out.println("If you want to deposit amount, Please enter amount:");
            bankAccount.Deposit(bankAccount.getAccountNumber(), Double.parseDouble(scanner.nextLine()));
            boolean check = false;
            while (!check) {
                System.out.println("If you want to withdraw amount, Please enter amount:");
                check = bankAccount.Withdraw(bankAccount.getAccountNumber(), Double.parseDouble(scanner.nextLine()));
            }
        } else {
            System.out.println("code not ready yet");
        }
    }
}