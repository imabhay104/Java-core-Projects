import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(15);
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
       // queue.offer(15);
        System.out.println(queue);

    }

}
