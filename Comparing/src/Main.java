import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)
    {
        Integer a=5;
        Integer[] array={1,2,3,4,5};
//        Double[] array1={1.0,2.0};
        for (Integer i: array)
        {
            int val=a.compareTo(i);
            System.out.printf(val<0? "less": val==0? "Equal":"great"+"\n");
        }
        String b="banana";
        String[] fruits={"apple","unkown","banana"};

        for (String i: fruits)
        {
            int val=b.compareTo(i);
            System.out.printf(val<0? "less": val==0? "Equal":"great"+"\n");
        }
        Arrays.sort(fruits);

        System.out.print(Arrays.toString(fruits));
        Student s1=new Student("ABhay",10);
        Student s2=new Student("Sid",12);
        Student s3=new Student("Sankya",13);
        Student[] std={s2,s3};
        Arrays.sort(std);

//        Student1 s11=new Student1("ABhay");
//        Student1 s22=new Student1("Sid");
//        Student1 s33=new Student1("Sankya");
//        Student1[] std1={s22,s33};
//        Arrays.sort(std1);
//        System.out.print(Arrays.toString(std));
//        Comparator<Student> std45 = new Comparator<>(s11);


    }
    record Student(String name, int roll_no) implements Comparable<Student>,Comparator<Student> {
        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    };
    record Student1(String name, int id, double gpa) implements Comparable<Student1> {

        @Override
        public int compareTo(Student1 o) {
            return this.name.compareTo(o.name);
        }
    };
}
