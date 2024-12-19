public class DigitSum {
    public static void main(String[] args) {

        System.out.println("10 ="+SumDigits(10));
        System.out.println("-125 ="+SumDigits(-125));
        System.out.println("12345 ="+SumDigits(12345));
    }

    public static int sumDigits(int no)
    {
        int sum=0;
        if (no<0) return -1;
        else if (no<=10) {
            return  no;
        }
        else
        {
            int digit=0;
            while(no!=0)
            {
                digit=no%10;
                sum=sum+digit;
                no=no/10;
            }
           // sum=sum+(no%10);
        }
        return  sum;
    }
    public static int SumDigits(int no)
    {
        if (no<0)
        {
            return -1;
        }
        int sum=0;
        while (no>9)
        {
            sum+=no%10;
            no=no/10;
        }
        sum+=no;
        return  sum;

    }
}
