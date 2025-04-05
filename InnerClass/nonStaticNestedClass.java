public class nonStaticNestedClass {
    String message = "Hii from the Non-Static Nested class.";
    class innerNonStaticNestedClass
    {
        innerNonStaticNestedClass() // constructor of the innerNonStaticNestedClass 
        {
            System.out.println(message);
        }
        void show()
        {
            System.out.println("Hi from the show function of inner Non static nested class.");
        }
    }
    public static void main(String[] args) {
        nonStaticNestedClass outer = new nonStaticNestedClass();
        nonStaticNestedClass.innerNonStaticNestedClass inner = outer.new innerNonStaticNestedClass();
        inner.show();
    }
}
