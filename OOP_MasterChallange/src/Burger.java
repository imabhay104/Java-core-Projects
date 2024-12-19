import java.util.Scanner;

public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;
    private static final String burger_type="burger";

    public Burger()
    {
        super(burger_type,100,"Regular Burger","R");
    }
   Burger(String type, double price, String name, String size)
   {
       super(type,price,name,size);
   }

    @Override
    public void printItem() {
        super.printItem();
        try {
            if (!extra1.getName().isBlank())extra1.printItem();
            if (!extra2.getName().isBlank())extra2.printItem();
            if (!extra3.getName().isBlank())extra3.printItem();

        } catch (RuntimeException e) {
            System.out.println("No Toppings Ordered\n");
        }

    }

    @Override
    public String toString() {
        return "Burger{" +
                "extra1=" + extra1 +
                ", extra2=" + extra2 +
                ", extra3=" + extra3 +
                "} " + super.toString();
    }

    public void addToppings() {
        String input;
        int n,i=0;
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("select No of toppings to add>(Max allowed 3)");
        do {
            input = scanner.nextLine();
            n = Integer.parseInt(input);
            if (n > 3) {
                System.out.println("Max allowed 3");
                quit = true;
            } else quit = false;
        } while (quit);

        for (i = 0; i < n; i++) {
            System.out.println("select type,price, name of toppings\nEnter values with space\nPress Q to quit\n");
            input = scanner.nextLine();
            input = input.trim();
            if ("Qq".contains(input)) {
                quit = true;
                break;
            }
            String[] values = input.split("\\s+");
            if (values.length == 0 || values.length > 4) {
                System.out.println("Entered wrong, please re enter\n");
                i = 0;
                continue;
            }
            var assign = new Item(values[0], Double.parseDouble(values[1]), values[2], "");
            if (i == 0) extra1 = assign;
            if (i == 1) extra2 = assign;
            if (i == 3) extra3 = assign;

        }
        switch (i){
            default-> System.out.println("No Toppings oprdered");
            case 1->extra1.printItem();
            case 2->extra2.printItem();
            case 3->extra3.printItem();
        };

//        if (!quit) {
//            System.out.println("Toppings added:\n");
//            if (!extra1.getName().isBlank()) extra1.printItem();
//            if (!extra2.getName().isBlank()) extra1.printItem();
//            if (!extra3.getName().isBlank()) extra1.printItem();
//        }
    }

    public double getPrice() {
        double totalPrice = 0;

        if (extra1 != null) {
            totalPrice += extra1.getPrice();
        }

        if (extra2 != null) {
            totalPrice += extra2.getPrice();
        }

        if (extra3 != null) {
            totalPrice += extra3.getPrice();
        }

        return super.getPrice()+totalPrice;
    }


}