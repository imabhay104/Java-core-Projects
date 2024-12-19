public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345));

    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        boolean check;
        int sum=0,digit=0;
        while (number != 0) {

            digit = number % 10;
            check=isEven(number);
            if (check)
                sum+=digit;
            number=number/10;

        }
        return  sum;
    }
    public static boolean isEven(int number)
    {
            if (number%2==0) return true;
            else return false;

    }
}
