package world.ferrina;

import java.util.ArrayList;
record OrderItem(int quantity , ProductForSale product){}
public class Store {
    private static ArrayList<ProductForSale> list=new ArrayList<>();
    public static void main(String[] args) {
//        list.add(new Mouse("Wireless Mouse",100,"One & only wireless mouse on earth"));
//        list.add(new Mouse("Bluetooth Mouse",100,"One & only bloodshot mouse on earth"));
//        listProducts();
//        var order1=new ArrayList<OrderItem>();
//        addOrder(order1,1,2);
//        addOrder(order1,0,1);
//       // addOrder(order1,2,1);
//        printOrder(order1);
        Bird bird=new Bird();
        Animal animal=bird;
        Trackable track=bird;
        animal.move();;
       // track.move();
         enum A{1,2,3,4};

    }
    public static void listProducts()
    {
        for (var i: list)
        {
            System.out.println("-----");
            i.showDetails();
        }
    }
    public static void addOrder(ArrayList<OrderItem> order, int index, int qua)
    {
        order.add(new OrderItem(qua,list.get(index)));
    }
    public static void printOrder(ArrayList<OrderItem> order)
    {
        double sales=0d;
        for (var i: order)
        {
            i.product().printPricedItem(i.quantity());
            sales+=i.product().getSalesPrice(i.quantity());
        }
        System.out.println("Total Sales:"+sales);

    }
}
