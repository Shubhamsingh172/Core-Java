public class BoxDemo2
{
    public static void main(String[] args) 
    {
        Box B1 = new Box();
        B1.setBox(1.1, 2.2, 3.3);
        B1.showBox("B1");
        System.out.println("Volume of the Box B1 is : " + B1.volume());
        System.out.println();

        Box B2 = new Box();
        B2.setBox(11.11, 22.22, 33.33);
        B2.showBox("B2");
        System.out.println("Volume of the Box B2 is : " + B2.volume());

        //we can create multiple object to perform the operation
        
        //comparing the two object whether it is same or not 
        if(B2.compare(B1))
            System.out.println("B2 == B1");
        else 
            System.out.println("B != B2");
    }
}
