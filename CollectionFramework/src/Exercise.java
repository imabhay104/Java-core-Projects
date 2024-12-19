import java.util.PriorityQueue;
import java.util.Queue;

record Student1(int roll_no, double marks)  {
//    @Override
//    public int compareTo(Student1 that) {
//        // Use descending order of marks
//        return Double.compare(that.marks, this.marks);
//    }

    @Override
    public String toString() {
        return "Roll No: " + roll_no + ", Marks: " + marks;
    }
}

public class Exercise {
    public static void main(String[] args) {
        Queue<Student1> result = new PriorityQueue<>();
        result.add(new Student1(1, 80));
        result.add(new Student1(2, 90));
        result.add(new Student1(3, 40));
        result.add(new Student1(4, 100));

        // Peek at the top element (highest marks due to compareTo implementation)
        System.out.println("Top student (highest marks): " + result.peek());
    }
}
