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
/*
2️⃣ Non-static Nested Class (Inner Class)
Yeh ek non-static class hoti hai jo kisi outer class ke andar define hoti hai.

Iska object banane ke liye pehle outer class ka object banana zaroori hota hai.

Yeh outer class ke sabhi members ko access kar sakti hai, including private members.

✅ Inner class outer class ke private members ko access kar sakti hai.
✅ Iska object outer class ke bina nahi ban sakta.

 */