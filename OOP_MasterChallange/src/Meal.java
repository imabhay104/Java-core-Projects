import java.util.Scanner;

public class Meal {
    private Burger burger;
    private Item drink;
    private Item side;

   public void MealOrder()
   {
        burger=new Burger();
        drink=new Item("Drink",50,"Coca-cola","R");
        side=new Item("Side",50,"French-fries","R");
   }
   public Meal()
   {
       System.out.println("Welcome to Bill's Burger\n"+"*****\n".repeat(4));
       Scanner scanner=new Scanner(System.in);
       System.out.println("Please enter price,name,size of burger with space");
       String input=scanner.nextLine();
       input=input.trim();
       String[] values=input.split("\\s+");
       burger=new Burger("Burger",Double.parseDouble(values[0]),values[1],values[2]);
       System.out.println("Do you wnat to add Toppoings? Max 3 are alllowed\npress N to no");
       input=scanner.nextLine();
       if (!("nN".contains(input))) {
        burger.addToppings();
       }
       System.out.println("Please enter price,name,size of Drink with space");
       input=scanner.nextLine();
       input=input.trim();
       values=input.split("\\s+");
       drink=new Item("Drink",Double.parseDouble(values[0]),values[1],values[2]);

       System.out.println("Please enter price,name,size of Drink with side-dish");
       input=scanner.nextLine();
       input=input.trim();
       values=input.split("\\s+");
       side=new Item("Side Dish",Double.parseDouble(values[0]),values[1],values[2]);

       MealPrinter();
       Pricecalculator();

   }
   public void MealPrinter()
   {
       System.out.println("Meal ordered\n");
         burger.printItem();
         drink.printItem();
         side.printItem();
   }
   public void Pricecalculator()
   {
       System.out.println(burger.getPrice()+ drink.getPrice()+side.getPrice());
   }

}