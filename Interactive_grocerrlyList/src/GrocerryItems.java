import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GrocerryItems  {

    private record grocerry (String name,int quantity)
    {
        public grocerry(String name)
        {
            this(name,1);
        }
        @Override
        public String toString() {

            return String.format("%s : %d", name.toUpperCase(),quantity);
        }
        public String getName() {
            return name;
        }

    }
    private ArrayList<grocerry> items=new ArrayList<>();

    public GrocerryItems()
    {
        Scanner scanner = new Scanner(System.in);
        int choice=choiceconverter(scanner.nextLine());
        while(choice!=0)
        {
            if (choice==1)
            {
                System.out.println(addItems());
            }
            if (choice==2)
            {
               if (items.isEmpty()) System.out.println("List is empty,please add items to list pressing 1");
                  else  System.out.println(removeItems());
            }
            choice=choiceconverter(scanner.nextLine());
        }

    }
    private int choiceconverter(String name)
    {
        return Integer.parseInt(name);
    }
    private String addItems()
    {
        System.out.println("In addItems");

        Scanner scanner = new Scanner(System.in);
        String[] array=stringarray(scanner.nextLine());
        System.out.println("converted user ip string is"+array.toString());

        int length=array.length;
        for(String item : array)
        {
            System.out.println("In loop to add element");
            if (items.contains(item))
            {
                System.out.printf("%s is already added in grocessry list, Neglating %s",item,item);
                continue;
            }
            items.add(new grocerry(item));
        }
       items.sort(Comparator.comparing(grocerry::getName));
        return items.toString();
    }
    private String removeItems()
    {
        Scanner scanner = new Scanner(System.in);
        String[] array=stringarray(scanner.nextLine());
        int length=array.length;
        for(String item : array)
        {            System.out.println("in remove loop");

            System.out.println("removing :"+item);
            if(items.remove(new grocerry(item)))
            System.out.println("removed");
            else             System.out.println("failed");


        }
        items.sort(Comparator.comparing(grocerry::getName));
        return items.toString();
    }
    private String[] stringarray(String s)
    {
        s.trim();
        String[] array=s.split("\\s*,\\s*");
        return array;
    }
}
