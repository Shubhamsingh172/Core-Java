package StaticBlock;

public class PrintStreamm {
    public void print(int i)
    {
        System.out.print(i);
    }
    public void print(char c)
    {
        System.out.print(c);
    }
    public void println(int i)
    {
        System.out.println(i);
    }
    public void println(char c)
    {
        System.out.println(c);
    }
}

class Systemm{
    /*
    🤔 Which one to use?
        Agar tumhara object sirf new PrintStreamm() jaisa simple hai → direct initialization is best.

        Agar constructor mein logic ho, ya kuch calculations chahiye ho before assigning → static block is better.
    */
    //static final PrintStreamm outt = new PrintStreamm(); ----> this is also valid but only for the simplest one 
    static final PrintStreamm outt;
    static 
    {
        outt = new PrintStreamm();
    }
}

class Sample
{
    public static void main(String[] args)
    {
        Systemm.outt.print('a');
        Systemm.outt.println('b');
        Systemm.outt.print(24);
        Systemm.outt.println(45);
    }
}


