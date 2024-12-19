import java.util.*;
import java.util.stream.IntStream;
 class MultiGenericCollection {

    // Method that takes two collections with different types
    public static <T, U>  void printListItems(List<T> list1, List<U> list2) {
        System.out.println("List 1: ");
        for (T item : list1) {
            System.out.println(item);
        }

        System.out.println("List 2: ");
        for (U item : list2) {
            System.out.println(item);
        }
    }}
public class Strams {
    public static void main(String[] args) {

        int[] array2 = {2, 3, 4, 2, 4, 2};
        int[] array1 = IntStream.range(0, array2.length)
                .map(i -> array2[array2.length - 1 - i])
                .toArray();
        System.out.println(Arrays.toString(array1));
        List<String> list = new ArrayList<>();
        list.add("1");
        list.addAll(Arrays.asList("1,23,4,4,323,13,3,".split(",")));
        list.stream()
                .filter(s -> !s.isEmpty()) // Ignore empty strings
                .map(Integer::parseInt)
                .filter(i -> i > 10)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println(list);
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(12);
        stack.pop();
        stack.peek();
        Collections.sort(stack,(a,b)->a.compareTo(b));
        stack.hashCode();

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Abhay");
        map.put(2,"Abhay");
        map.remove(map.containsKey(1));
        for (Map.Entry<Integer,String> e: map.entrySet())
        {
            System.out.println(e.getValue());
        }

//        Arrays.stream(new int[]{1, 2, 3, 4, 5})
//                .map(x->x*x)
//                .forEach(System.out::println);
//        Integer[] list = new Integer[]{0, 1, 2, 3, 4, 5};
//
//        // Correctly implement the Consumer
//        Consumer<Integer> consumer = s -> System.out.println(Math.sqrt(s));
//
//        // Apply the Consumer to each element in the array
//        for (Integer num : list) {
//            consumer.accept(num);
//        }
//        System.out.println(
//        IntStream.range(1,5).sum()
//);
//        Stream.of("Abhay", "sid", "sanket")
//                .map(t->t.substring(1))
//                .sorted(Comparator.naturalOrder())
//                .forEach(System.out::println);
//
//        List<String> people = Arrays.asList("Abhay","sid","sanket","Rohit");
//        people.stream().map(s->s.toUpperCase()).sorted(Comparator.naturalOrder()).forEach(System.out::println);
//
//        people.stream().map(s->s.toUpperCase()).sorted(Comparator.naturalOrder()).filter(x->x.startsWith("A")).forEach(System.out::println);
//        System.out.println("*".repeat(10));
//
//        Stream<String> rows = Arrays.stream(new String[]{"A,1,1.2", "B,3,4.3","C","D,5,2.4"});
////        System.out.println(rows.map(s -> s.split(",")).filter(s -> s.length < 3));
//        rows.map(s -> s.split(","))                                // Split each string into an array
//                .filter(arr -> arr.length > 2)                        // Filter arrays with fewer than 3 elements
//                .forEach(arr -> System.out.println(Arrays.toString(arr)));


//
//        String[] array = {"A,12,2.3","B,16,2.8","C","D,23,2.5","E,10,2.0"};
//        Stream<String> list = Arrays.stream(array);
//        LinkedList<String> lsi1 = list
//                .map(s -> s.split(","))                  // Split the string by commas
//                .filter(s -> s.length > 2)               // Filter arrays with more than 2 elements
//                .filter(s -> Integer.parseInt(s[1]) > 9) // Filter arrays where second element > 9
//                .map(s -> s[0] + s[1])                   // Combine first and second element into one string
//                .collect(Collectors.toCollection(LinkedList::new));
//
//        //.forEach(s-> System.out.println(s[0]+" "+s[1]+" "+s[2]));
//        lsi1.forEach(System.out::println);
//        for (int i=0;;) {
//            System.out.println("Infinite Loop");
//        }
//
//
//
//
//
//
//
//
//    }
//    public class GreatestCommonDivisor {
//        // write code here
//        public int getGreatestCommonDivisor(int first,int second)
//        {
//
//            if (!(first <10 || second <10))
//            {
//                int i=0, sum=(first+second)/2;
//                for (i=1;i<sum ;i++)
//                {
//                    if(first%i==0){
//                        if(second%i==0)
//                            i++;
//                    }
//                }
//                return i;
//            }
//            else return-1;
//
//        }
//    }
//}
        abstract class Animal<T> {
            protected int a = 10;

            abstract void sound();

            void sound1() {
                System.out.println("Animal sound");
            }
        }

        class Dog<T> extends Animal<T> {
            private T name;
            void sound() {
                a = 20;// Calls superclass's sound method
                System.out.println("Bark");
                sound1();
            }

            @Override
            void sound1() {
                super.sound1();
                Runnable runnable= () -> System.out.println(1
                );
            }
        }
        Dog<Integer> dog = new Dog();
        dog.sound1();

        interface Pair<K, V> {
            K getKey();
            V getValue();
        }
        class one  <b,l> implements Pair<Integer,Integer>{
            b person;
            @Override
            public Integer getKey() {
                return null;
            }

            @Override
            public Integer getValue() {
                return null;
            }
        }

        // Functional Interface
        interface MathOperation {
            int operation(int a, int b);
        }

         class LambdaExample {
            public static void main(String[] args) {
                // Using lambda expression to define operation
                MathOperation add = (a,b)->a+b;

                System.out.println("Result: " + add.operation(5, 3)); // Output: Result: 8
            }
        }

    }
}
