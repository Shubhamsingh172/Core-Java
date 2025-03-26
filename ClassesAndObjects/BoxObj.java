public class BoxObj
{
    double length;
    double width;
    double depth;
    
    //below given method with same name with different parameters gives the example of MethodOverloading
    void setBoxObj(double l, double w, double d)
    {
        length = l;
        width  = w;
        depth  = d;
    }
    void setBoxObj(double dim)
    {
        length = depth = width = dim;
    }

    double volume()
    {
        return length * width * depth;
    }

    void display(String who)
    {
        System.out.println(who);
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
    }
    public static void main(String[] args)
    {
        // boxes having all three different dimension
        BoxObj B1 = new BoxObj(); 
        B1.setBoxObj(1.1, 2.2, 3.3);
        B1.display("B1");
        System.out.println("Volume : " + B1.volume());
        System.out.println();
        
        //boxes having all same dimension
        BoxObj B2 = new BoxObj();
        B2.setBoxObj(1.1);
        B2.display("B2");
        System.out.println("Volume : " + B2.volume());

    }
}
