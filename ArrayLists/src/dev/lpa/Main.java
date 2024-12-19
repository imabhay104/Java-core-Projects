package dev.lpa;

import java.util.ArrayList;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

//        GroceryItem[] groceryArray = new GroceryItem[3];
//        groceryArray[0] = new GroceryItem("milk");
//        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
//        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
//        System.out.println(Arrays.toString(groceryArray));
//
//        ArrayList objectList = new ArrayList();
//        objectList.add(new GroceryItem("Butter"));
//        objectList.add("Yogurt");
//        objectList.add("New item");
//        objectList.remove(1);
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
//        groceryList.add(new GroceryItem("Butter"));
//        groceryList.add(new GroceryItem("milk"));
//        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
//        groceryList.set(0,
//                new GroceryItem("apples", "PRODUCE", 6));
//        groceryList.remove(1);
//        System.out.println(groceryList.get(0));
//        System.out.println(groceryList.contains("Apples"));

        List<GroceryItem> bajar = new ArrayList<>();
        bajar.add(new GroceryItem("milk"));
        bajar.add(new GroceryItem("butter","protin",1));
        bajar.add(bajar.size()-1,new GroceryItem("water"));
       // bajar.replaceAll(item -> new GroceryItem("milk"));
        bajar.addAll(2, List.of(new GroceryItem("milk"), new GroceryItem("eggs")));
        System.out.println(bajar);


        
    }
}
