import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface replace {
    void transferAll(List<String> list);
}
public class Assignment {

    public static void main(String[] args) {
        String[] string = {"Abhay", "Sis", "Sanket", "bOb"};
        List<String> list = Arrays.asList(string);
        list.replace(list)
        list.replaceAll();


    }
}
