public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number)
    {
        //if (number<0) return  false;
//        else
//        {
         int reverse = 0, originalNumber=number;
         int lastDigit=0;
         while (number!=0)
         {
             lastDigit=number%10;
             reverse=reverse*10+lastDigit;
             number=number/10;
         }
         if (originalNumber==reverse) return  true;
         else  return false;

        }

}
