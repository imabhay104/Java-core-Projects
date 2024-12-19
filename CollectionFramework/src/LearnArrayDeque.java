import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> i = new ArrayDeque<>();
        i.offer(10);
        i.offerFirst(12);
        i.offerLast(13);
        i.offer(30);
    }
}
