package world.ferrina;

import java.util.LinkedList;
import java.util.ListIterator;

record Place(String name, int distance)
{
    @Override
    public String toString() {
        return name + "("+distance+")";
    }
}
public class Main {
    public static void main(String[] args) {
//        list.add("Sydeny");
//        list.indexOf("Sydeny");
//        list.add("goa");
//        list.add("pune");
//        list.push("germany");
//        list.push("Nipani");
//        System.out.println(list);
//        System.out.println("After\n"+list);
//        list.size();
//
//        ListIterator<String> i =list.listIterator()
//        ;
//        while(i.hasNext())
//        {
//          //  System.out.println(i.next());
//            if (i.next().equals("Nipani")){ i.remove();}
//            //else System.out.println(i.next());
//        }
//        System.out.println(list);
        LinkedList<Place> list = new LinkedList<>();
        addPlace(list, new Place("Delhi", 510));

        addPlace(list, new Place("Bombay", 110));
        addPlace(list, new Place("Pune", 140));
        addPlace(list, new Place("Kolhapur", 520));


        System.out.println(list);
        System.out.println("**".repeat(10));
        ListIterator<Place> i = list.listIterator();
        while (i.hasNext()) System.out.println(i.next());


    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) ;
        else {
            int i=0;
            if (list.isEmpty()==true) list.add(place);
            else {
                for (var p : list) {
                    if (p.distance() < place.distance()) {
                        System.out.println("in if");
                        list.add(i, place);
                    }
                    i++;
                }
            }

        }


    }
}
