public class Prime {
    public static void main(String[] args) {
        boolean check;
        int counter=0,i;
        for (i = 1; i<1000000; i++)
        {
            check=isPrime(i);
            if (check) {
                System.out.println(i+" is a prime number");
                counter++;
            }
        }
        System.out.println("There are "+counter+" prime numbers between 1 to "+i+"");
    }
    public static boolean isPrime(int no)
    {
        int i;
        if (no < 2) {
            return false;
        }
        for (i=2; i<=no/2; i++)
        {
            if (no%i==0) return false;
        }
        return  true;
    }
}
