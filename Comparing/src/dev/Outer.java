interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {

            }
        }
        };

        greet.sayHello(); // Prints: Hello from anonymous class!
    }
}
