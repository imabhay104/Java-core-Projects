import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {

        LinkedList<String> student = new LinkedList();
        student.add(new String("Abhay"));
        student.addFirst("abhay");
        student.add(1,"pappa");
        List<String> t1=new ArrayList<>();
        t1= Arrays.asList("sss","sasa");
        student.addAll(0,t1);
        System.out.println(student);
        student.get(0);
        //student.remove(0);
        student.remove(t1);
        student.forEach(s-> System.out.println(s));
        System.out.println(student);

        Iterator<String> i = student.iterator();
while (i.hasNext()) System.out.println(i.next());

    }
}
