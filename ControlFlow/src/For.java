public class For {
    public static void main(String[] args) {

        double intrestRate;
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        for(intrestRate=2.0; intrestRate<=10.0; intrestRate+=2.0)
        System.out.println("10000 at "+intrestRate+"% intest is="+IntrestCalculator(10000,intrestRate));

        for (intrestRate=7.5;intrestRate<=10;intrestRate+=0.25){
            System.out.println("10000 at "+intrestRate+"% intest is="+IntrestCalculator(10000,intrestRate));
        }
    }

    public static double IntrestCalculator(double amount, double intrest) {
            double value = amount* (intrest/100);
            return value;
    }
}
