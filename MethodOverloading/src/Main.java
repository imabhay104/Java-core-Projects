import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

        double cm=convertToCentimeters(5,8);
        System.out.println(cm);
        System.out.println(round(cm));
    }
    public static double convertToCentimeters(int height)
    {       //inch to cm
            return height*2.54;
    }
    public static double convertToCentimeters(int feet,int inch)
    {
        return (convertToCentimeters(feet)*12+convertToCentimeters(inch));

    }
}
