import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lmabdas {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable running\n");
            }
        };
        Runnable runnable1 =()-> System.out.println("runnable");
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.equals("Hellogggfgrf"));

//        List<String> names = Arrays.asList("Abhay","Shinde","Sid");// Output: false
//        System.out.println(names.stream().filter(s->s.startsWith("S")).forEach(s-> System.out.println(s)));
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

List<Integer> nos = Arrays.asList(23,2321,11,435,144,5235,5245,24);
Predicate<Integer> s = s1 ->s1>100000;
for(Integer i: nos)
{

    System.out.println(s.test(i));
}


                Function<String, Integer> stringLength = str -> str.length();

                System.out.println(stringLength.apply("Hello")); // 5
                System.out.println(stringLength.apply("Lambda")); // 6
           


    }
}
