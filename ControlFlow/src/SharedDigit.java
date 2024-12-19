public class SharedDigit {
    public static void main(String[] args) {
    System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int a, int b) {

        if ((a<=10 || a>99) || (b<=10 || b>99))
        {
            return  false;
        }
        int i=0,j=0,i_digit,j_digit,original_b=b;
        while (a!=0)
        {
            i_digit=a%10;
            a=a/10;
            b=original_b;
            while (b!=0)
            {
                j_digit=b%10;
                if (i_digit==j_digit) return true;
                b=b/10;
            }

        }
        return  false;
    }

    public class SharedDigit_chatgpt {
        // write code here
        public static boolean hasSharedDigit(int a, int b) {

            if ((a<=10 || a>99) || (b<=10 || b>99))
            {
                return  false;
            }
            int i=0,j=0,i_digit,j_digit,original_b=b;
            while (a!=0)
            {
                i_digit=a%10;
                a=a/10;
                b=original_b;
                while (b!=0)
                {
                    j_digit=b%10;
                    if (i_digit==j_digit) return true;
                    b=b/10;
                }

            }
            return  false;
        }
    }
}
