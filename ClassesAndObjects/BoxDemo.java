class Box
{
    double length;
    double width;
    double depth;
}
class BoxDemo
{
    public static void main(String[] args)
    {
        Box b1 = new Box();
        b1.length = 1.1;
        System.out.println("B1");
        System.out.println("Length : " + b1.length);
        System.out.println("Width : " + b1.width);
        System.out.println("Depth : " + b1.depth);
        System.out.println();

        Box b2 = new Box(); // declare an object by using which we can perform the operation
        b2.length = 10.25;
        b2.width = 11.25;
        b2.depth = 12.25;
        System.out.println("B2");
        System.out.println("Length : " + b2.length);
        System.out.println("Width : " + b2.width);
        System.out.println("Depth : " + b2.depth);
        System.out.println();
    }
}