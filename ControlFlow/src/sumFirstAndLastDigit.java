public class sumFirstAndLastDigit {
    public static void main(String[] args) {
System.out.println(sumFirstAndLastDigit(213131));
    }

//    public static int sumFirstAndLastDigit(int number)
//    {
//            if (number<0) return -1;
//            int digit=0,sum=0;
//
//            digit=number%10;
//            sum+=digit;
//            while (number>0)
//            {
//                number=number/10;
//                if (number/10==0) break;
//                continue;
//            }
//            sum=sum+number%10;
//
//return sum;
//
//    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;  // Return -1 for negative numbers

        int lastDigit = number % 10;  // Get the last digit
        int firstDigit = number;      // Start with the full number

        // Loop to reduce `firstDigit` to the first digit
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;  // Remove last digits until we're left with the first digit
        }

        // Sum the first and last digits
        return firstDigit + lastDigit;
    }
}
