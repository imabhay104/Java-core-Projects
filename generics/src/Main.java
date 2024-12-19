record Player(String name, String position){}

public class Main {
    public static void main(String[] args) {
        Printer<Double> print1 =new Printer<>(19019.78);
        Printer<Character> print =new Printer<>('A');
        Printer<Boolean> print3 =new Printer<>(true);
        Player player=new Player("Abhay","one-down");
        Printer<Player> player1= new Printer<>(player);
        print.print();
        print1.print();
        player1.print();
        newPrinter(10);

    }
    public static <T> T newPrinter(T Print)
    {
        System.out.println(Print);
        return Print;
    }

}
