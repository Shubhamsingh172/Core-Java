public class Student1 {
    void display(Student1 s)
    {
        System.out.println("Object Received and Inside the display function.");
    }
    void show()
    {
        display(this);
    }
}

class callStudent
{
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.show();
    }
}
