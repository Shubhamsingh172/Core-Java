public class BoxDemo2
{
    public static void main(String[] args) 
    {
        Box B1 = new Box();
        B1.setBox(1.1, 2.2, 3.3);
        B1.showBox("B1");
        System.out.println("Volume of the Box B1 is : " + B1.volume());
        System.out.println();
    }
}
