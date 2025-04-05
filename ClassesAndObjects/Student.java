public class Student {
    int id;
    String name;
    Student()
    {
        this(53, "Shubham");
        System.out.println("Student class Default Constructor.");
    }
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        System.out.println("Student class Parameterized Constructor.");
    }
}

class thisCall
{
    public static void main(String[] args) {
        Student st = new Student();
    }
}