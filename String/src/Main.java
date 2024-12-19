public class Main {

    public static void main(String[] args) {
        String hello= "Hello"+"World";
        hello.concat("and bye");
        StringBuilder hello1 = new StringBuilder("Hello"+"World");
        hello1.append("and bye");
        printInfo(hello);
        printInfo(hello1);
        StringBuilder hello2 = new StringBuilder();
        hello2.append("a".repeat(16));
        StringBuilder hello3 = new StringBuilder(32);
        hello3.append("a".repeat(32));
        hello3.delete(1,31);
        printInfo(hello2);
        printInfo(hello3);



    }
    public static void printInfo(String string)
    {
        System.out.println(string);
        System.out.println(string.length());

    }
    public static void printInfo(StringBuilder string)
    {
        System.out.println(string);
        System.out.println(string.length());
        System.out.println("capacity :"+string.capacity());


    }
}
