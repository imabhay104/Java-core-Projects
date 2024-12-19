public class Challenge1 {
    public static void main(String[] args) {

        int sum = 0, count = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is evenly divisible by both 3 and 5");
                sum += i;
                count++;
            }

        }
        System.out.println("Sum is "+sum);


    }

}
