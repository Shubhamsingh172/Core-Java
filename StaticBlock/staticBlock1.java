package StaticBlock;

public class staticBlock1 {
    static int x;
    static
    {
        //here output states that static block are executed and runned before the main function 
        System.out.println("Hi from Static Block.");
        x = 5 * 5;
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("Hi from the main function.");
    }
}
