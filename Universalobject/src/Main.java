public class Main extends Object {

    public static void main(String[] args) {
        Student std = new Student("Abhay",24);
        System.out.println(std);
    }

}
class Student{
    private String name;
    private int age;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
