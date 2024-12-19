public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classlist;

    public String getClasslist() {
        return classlist;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClasslist(String classlist) {
        this.classlist = classlist;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name, String dateOfBirth, String classlist) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classlist = classlist;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }
}
