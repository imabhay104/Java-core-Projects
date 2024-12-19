import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> bingPool = new ArrayList<>(75);
        int start=1;
        for(char c: "BINGO".toCharArray())
        {
            for(int i=start;i<start+15;i++)
            {
                bingPool.add(""+c+i);
            }
            start=start+15;
        }
        Collections.shuffle(bingPool);
//        Consumer<String> s= s1-> System.out.println(s1);
//        bingPool.forEach(s);
        var firstones = bingPool.subList(0,15);
        firstones.sort(Comparator.naturalOrder());
        System.out.println("*".repeat(20));

        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.addAll(Arrays.asList(12,3,4,2,43,1313,1,313,43,13));
        System.out.println(list.stream().anyMatch(s->s>10));
    }

}
