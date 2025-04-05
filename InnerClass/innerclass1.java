class Outer
{
    private static String message = "Hi from Outer variable"; 
    class Inner // in java non-static nested class are called as inner class 
    {
        Inner() 
        {
            System.out.println(message);
        }
        void display()
        {
            System.out.println("\nMethod Define inside the Inner class.");
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
//✅ Inner class outer class ke members ko directly access kar sakti hai, even private members bhi.
//✅ Inner class ka object banane ke liye pehle outer class ka object banana padta hai.
//✅ Agar class static hoti, toh wo nested static class hoti, inner class nahi.

