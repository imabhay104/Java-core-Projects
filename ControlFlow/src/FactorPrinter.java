public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(12);
    }

    public static int printFactors(int number) {
            if (number<1) return -1;
            int i=1;
            while (i<=number)
            {
                if (number%i==0)
                    System.out.println(i);
                i++;
            }
            return 1;
    }
}
