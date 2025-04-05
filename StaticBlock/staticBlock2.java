package StaticBlock;

public class staticBlock2 {
    static
    {
        System.out.println("Static Block 1");
    }
    static
    {
        System.out.println("Static Block 2");
    }
    static 
    {
        System.out.println("Static Block 3");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
