interface Greet{
    void greet();
}

public class LambdaWithInterface {
    public static void main(String[] args) {
        // Using lambda to provide the implementation of greet method
        Greet greet = new  Greet(){

            @Override
            public void greet() {

            }
        };
        Greet greetLambda = () -> System.out.println("Hello, ");

        greetLambda.greet();  // Output: Hello, Alice
    }
}
