public class Ass2 {
    // write code here

    public static void printYearsAndDays(long minutes)
    {

        if (minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            long minutes_remain,days,years;
            years=minutes/(60*24*365);
            minutes_remain=minutes%(60*24*365);
            days=minutes_remain/(60*24);


            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }




    }

}