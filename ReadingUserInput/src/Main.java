import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int currentYear=2024, DOB;
//        String dob = "2000";
//        DOB=Integer.parseInt(dob);
//
//        System.out.println(DOB-currentYear);

        //getinput from user from console

//               String input=   System.console().readLine();
//                int age= Integer.parseInt(input);
//               System.out.println(age);

               Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Future\nPlease Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Welcome "+name+"\nPlease enter you date of birth yyyy format : ");
        String dob = scanner.nextLine();
         int DOB=Integer.parseInt(dob);
        DOB-=2024;
        System.out.println("ohh!!\n"+name+"\nyou are "+dob+" years old");














    }

//    public static void Validator(int currentYear, String dob )
//    {
//            int dob1 = Integer.parseInt(dob);
//            int minYear= currentYear - 125;
//            if (dob1<0 || minYear)
//
//    }
}
