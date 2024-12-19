import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter no:(press any character to quit)\n");
    boolean bool=true;
    int maximumNo=0,mimimumNo=0;
        while (bool)
        try {
            int s=IntConverter(scanner.nextLine());

            if (s>maximumNo) maximumNo=s;
            if (s<mimimumNo) {
                mimimumNo=s;
            }


        } catch (NumberFormatException e) {

         bool=false;
        }
System.out.println("Max no is "+maximumNo+" Minimun no is: "+mimimumNo);

    }

    public static int IntConverter(String s) {
        return Integer.parseInt(s);
    }

}
