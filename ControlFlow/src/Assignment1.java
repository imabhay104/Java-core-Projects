public class Assignment1 {

    public static void main(String[] args) {

        System.out.println("Nato value is - "+NATO('B'));
    }

    public static String NATO(char c) {

        switch (c) {
            case 'A' -> {
                return "Able";
            }
            case 'B' -> {
                return "baker";
            }
            case 'C' -> {
                return "Charlie";
            }
            case 'D' -> {
                return "Dog";
            }
            default -> {
                String s = "out of box";
                return s;
            }
        }
    }
}
