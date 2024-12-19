public class Main {
    public static void main(String [] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudenty s = new LPAStudenty("S" + i,
                    switch (i) {
                        case 1 -> "A";
                        case 2 -> "B";
                        case 3 -> "C";
                        case 4 -> "D";
                        case 5 -> "E";
                        default -> "Anonymous";

                    }
                    , "10-04-2000", "ABC");
               // System.out.println(s);
                System.out.println(s.toString());
            System.out.println("Pojo isnt good why beacuse we have record i.e. "+s.name());


        }


    }
}
