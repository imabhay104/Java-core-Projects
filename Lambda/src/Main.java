import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String Firstname,String lastName){
        @Override
        public String toString() {
            return Firstname + ""+ lastName;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("Abhay","Shinde");
        Main.Person p1 = new Person("Abhay","Shinde1");
        Main.Person p2 = new Person("baba","Shinde1");

        List<Person> people = new ArrayList<>(Arrays.asList(person,p2,p1));

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println("Before\n"+ people);
       // @FunctionalInterface
        interface myInter<t> extends Comparator<t> {
            int secondLevel(t o1, t o2);
        }
        var comp23 = new myInter<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
int r=o1.lastName().compareTo(o2.lastName());
                return r==0? secondLevel(o1,o2):r;

            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.Firstname().compareTo(o2.Firstname());
            }
        };
        people.sort(comp23);
        System.out.println("After\n"+ people);




    //Cat cat = new Cat();
    printAnything(()->System.out.print("Meow-Meow\n"));

    }
    public static void printAnything(Printable obj)
    {
     obj.print();
    }
}
