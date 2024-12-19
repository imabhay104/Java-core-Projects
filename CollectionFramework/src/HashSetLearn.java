import java.util.HashSet;
import java.util.Set;

record Student(int no, String name){
    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
    

}
public class HashSetLearn {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student(1,"Abhay"));
        students.add(new Student(2,"Sid"));
        students.add(new Student(   2,"Sid"));
        students.add(new Student(1,"Abhay"));
        System.out.println(students);
        students.hashCode();
        students.hashCode();

//      Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
//      set.add(10);
//      set.add(20);
//      set.add(50);
//      set.add(40);
//        set.add(40);
//        set.addAll(Arrays.asList(12,13,14));
//        System.out.println(set.contains(40));

//        System.out.println(set);

}


}
