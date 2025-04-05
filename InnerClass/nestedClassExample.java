public class nestedClassExample {
    private String message = "Hi from innerClassExample";
    class innerClassExample
    {
        innerClassExample()
        {
            System.out.println(message);
        }
        void show()
        {
            System.out.println("Hello hii from show function of innerClassExample.");
        }
    }
    void display()
    {
        innerClassExample obj = new innerClassExample();
        obj.show();
    }
    public static void main(String[] args) {
        nestedClassExample outer = new nestedClassExample();
        outer.display();
        nestedClassExample.innerClassExample inner = outer.new innerClassExample();
        inner.show();
    }
}
