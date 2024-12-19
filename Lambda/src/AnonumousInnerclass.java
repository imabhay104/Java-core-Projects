import java.util.Arrays;
import java.util.List;

public class AnonumousInnerclass {
    public static void main(String[] args) {
            Animal animal =new Animal();
            animal.makeNoise();

            Animal newAnimal = new Animal(){
                private int a=10;
                    public void makeNoise()
                    {
                        new Animal();
                    }
            };
        newAnimal.makeNoise();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println); // Using method reference

    }
}
