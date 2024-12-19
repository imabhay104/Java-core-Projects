public class Switch {

    public static void  main(String[] args) {

        int value=201;

//        switch (value) {
//            case 1:
//                value = 100;
//                break;
//            case 2:
//            case 3:
//                value = 103;
//                break;
//            case 4:
//                value = 104;
//                break;
//            default:
//                System.out.println("Incorrect");
//                break;
//        }

        switch (value) {
            case 1:
                value = 20;
                break;
            case 2:
                value = 30;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                value = 40;
                break;
            default:
                value = 90;
                break;
        }

        System.out.println(value);
    }

}
