import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi User!!!\nPlease Enter 5 numbers:\n");
        int count=1,no=1,s=0,sum=0;
        do {
            System.out.println("Enter number "+no+":");
            try
            {
                s=convertInteger(scanner.nextLine());
                sum+=s;
                count++;
                no++;
            } catch (NumberFormatException e) {
                System.out.println("&#133;&#133;&#133;&#133;&#133;&#133;&#133;\nPlease enter correct no\n");
            }



        }while (count<6);

        System.out.println("Sum is : "+sum);
    }

    public static int convertInteger(String no)
    {
        return Integer.parseInt(no);
    }
}
