public class Box 
{
    double length;
    double width;
    double depth;

    void setBox(double l, double w, double d) // non static method 
    {
        length = l;
        width = w;
        depth = d;
    }
    double volume()
    {
        return length * width * depth;
    }
    void showBox(String who) // non static method
    {
        System.out.println(who);
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
    }
}
