public class Ass1 {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,145));
    }
    public  static  String getDurationString(int secnods)
    {
        if (secnods>=0)
        {
            int hour = secnods/3600;
            int rem_sec = secnods%3600;
            int min = rem_sec/60;
            int rec_sec=rem_sec%60;
            return  hour+" hr "+min+ " min "+rec_sec+" seconds";
        }
        return ("Wrong "+ secnods + " value");

    }
    public  static  String getDurationString(int minutes, int seconds)
    {
        if (minutes>=0 && seconds>=0 && seconds<=59)
        {
                minutes=minutes*60;
                seconds=seconds+minutes;
            return getDurationString(seconds);
        }
        return ("Wrong "+minutes+" & "+seconds+" value");
    }
}
