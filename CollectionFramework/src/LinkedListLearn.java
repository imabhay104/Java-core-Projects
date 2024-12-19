import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListLearn {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.offer("c");
        queue.offer("d");
        queue.poll();
        System.out.println(queue.element());
        queue.peek();
        queue.forEach(s-> System.out.println(s));


        Collections.reverse(queue);

    }

}
