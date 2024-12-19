import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> im = new TreeMap<>();
        im.put("ten",10);
        im.put("one",1);
        im.put("two",2);
        System.out.println(im.get("ten"));
        im.put("ten",12);
        System.out.println(im+"\n");
        im.containsValue(10);

        for (Map.Entry<String,Integer> e: im.entrySet())
        {
            System.out.println(e.getClass());
            System.out.println(e.getValue());
        }
    }
}
