public class Test {

    public static void main(String[] args)
    {
        int a_=20;
        System.out.println(a_);
        double d1 = 20.00d;
        double d2 = 80.00;
        double d3 = (d1+d2)*100.00;
        System.out.println("total is "+d3);

        double d4 = d3%40.00;
        boolean checker = (d4==0.00) ? true : false;
        System.out.println(checker);
        if(!checker)
        {
            System.out.println("got some remiander");
        }

    }
}
