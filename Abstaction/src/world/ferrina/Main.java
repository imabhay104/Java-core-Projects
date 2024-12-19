package world.ferrina;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Dog("DOg", "big", "100"));
        list.add(new Dog("DOg", "small", "200"));
        System.out.println(list);
        for (Animal animal: list)
        {
            System.out.println(animal);

        }


    }
}