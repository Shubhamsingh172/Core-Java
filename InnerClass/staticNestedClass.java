public class staticNestedClass {
    private static String message = "Hii I am Outer staticNestedClass";
    static class InnerStaticNested
    {
        InnerStaticNested()
        {
            System.out.println(message);
        }
        void display()
        {
            System.out.println("Message from the display function of InnerStaticNested Class.");
        }
    }
    public static void main(String[] args) {
        InnerStaticNested inner = new InnerStaticNested();
        inner.display();
    }
}
/*
Types of Nested Classes:
Nested classes do types ki hoti hain:

Static Nested Class

Non-static Nested Class (Inner Class)

1️⃣ Static Nested Class
Yeh ek static class hoti hai jo kisi outer class ke andar define hoti hai.

Iska object banane ke liye outer class ka object banana zaroori nahi hota.

Yeh sirf outer class ke static members ko access kar sakti hai.

✅ Static nested class ka object directly outer class ke bina ban sakta hai.
✅ Sirf static members ko access kar sakti hai.
 */