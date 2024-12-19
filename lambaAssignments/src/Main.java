import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names={"Anna","Bob","Gary","Fred"};
            Arrays.setAll(names, i->names[i].toUpperCase());
          //  Arrays.setAll(names,value -> names);
            System.out.println(Arrays.toString(names));

        List<String> list = Arrays.asList(names);

        list.replaceAll(s->s+=" "+getRandomchar('A','Z')+".");
        System.out.println(list);

        list.replaceAll(s->s+=" "+reverse(s.split(" ")[0]));
        System.out.println(list+"\n\n");
        System.out.println(Arrays.toString(names));

        list.forEach(s->System.out.print(s));
        List<String> names1 = new ArrayList<>(List.of("ANNA Q. ANNA", "BOB D. BOB", "GARY H. YRAG", "FRED W. DERF"));

        names1.removeIf(name -> {
            // Extract the first and last names
            String firstName = name.substring(0, name.indexOf(" ")); // Gets from start up to the first space
            String lastName = name.substring(name.lastIndexOf(" ") + 1); // Gets from last space to end
            return firstName.equals(lastName);
        });

        System.out.println("new list-  "+names1);

    }
    public static char getRandomchar(char first,char last)
    {
        return (char)random.nextInt((int)first,(int)last);
    }
    public static String reverse(String name) {
            return new StringBuilder(name).reverse().toString();
    }

    }
