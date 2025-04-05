package StaticBlock;
class A
{
    static 
    {
        System.out.println("Inside - A's static Block.");
    }
}

class B
{
    static
    {
        System.out.println("Inside - B's static Block.");
    }
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Inside Main");
    }
}