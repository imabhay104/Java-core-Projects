package world.ferrina;

import java.util.ArrayList;

record grocceryItems(String name, String type, int count)
{
    public grocceryItems(String name)
    {
        this(name,"DAIRY",1);
    }
}
public class Main {
    public static void main(String[] args) {
        grocceryItems[] abc = new grocceryItems[3];
        abc[0]=new grocceryItems("milk");
        abc[1] =new grocceryItems("apples", "PRODUCE",4);
        ArrayList<grocceryItems> list = new ArrayList<grocceryItems>();
        list.add(new grocceryItems("milk"));
        list.add(0,new grocceryItems("dada"));

        System.out.println(list);
        //list.toString();




    }


}


