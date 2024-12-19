public class Main {
    public static void main(String[] args) {

//        Integer var = new Integer(5);
//        Integer var1=5;
//
//        String[] array={"abhay","shinde"};
//        Float[] array1={1.50F,6.7F,8.8F};
//        Float[] array2=new Float[4];
        Bank bank = new Bank("IDBI Bank");
        bank.addCustomer("Abhay");
        bank.addTransaction("Abhay", 100.0);
        bank.addTransaction("Abhay", -100.0);

        bank.addCustomer("sid");
        bank.addTransaction("sid", 200.0);
        bank.addTransaction("sid", -100.0);
        days.values();
        String s="abhay";
        System.out.println(s.substring(2));


    }
    public enum days{Monday,Tuesday,thursay}
}
