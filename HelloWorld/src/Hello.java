public class Hello {
    public static void main(String[] args)
    {
        System.out.println("Atomic Habits");
        boolean isAlien=false;
        float f=9.0f;
        if (isAlien==false)
        {
            System.out.println("its not an alien");
        }
        int topScore=100;
        int secondTopscore=65;
        if(topScore <= 100)
        {
            System.out.println("highest score");
        }
        if (topScore>90 || secondTopscore<100)
        {
            System.out.println("both are true!!!");
        }
        int newValue=50;
        if (newValue==50)
        {
            System.out.println("this is an error");
        }
        boolean isCar=true;
        if (isCar==false){
            System.out.print("check if boolean is true");
        }

        String makerOfCar = "JaguarLandRover";
        boolean is_UKmade = makerOfCar == "JaguarLandRover" ? true : false;
        System.out.println("\n\n"+is_UKmade);
    }

}
