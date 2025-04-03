public class Rectangle
{
    double length;
    double breadth;

    Rectangle()
    {
        length = 0.0;
        breadth = 0.0;
    }

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    Rectangle(Rectange R)
    {
        length = R.length;
        breadth = R.breadth;
    }

    double areaOfRectangle()
    {
        return length * breadth;
    }

    double perimeterOfRectangle()
    {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        //using default constructor
        Rectangle R1 = new Rectangle();
        System.out.println("Area : " + R1.areaOfRectangle());
        System.out.println("Perimeter : " + R1.perimeterOfRectangle());
        System.out.println();
        //using parameterized constructor 

        Rectangle R2 = new Rectangle(5.0,5.0);
        System.out.println("Area : " + R2.areaOfRectangle());
        System.out.println("Perimeter : " + R2.perimeterOfRectangle());

        Rectangle R3 = R2;
        System.out.println("Area : " + R3.areaOfRectangle());
        System.out.println("Perimeter : " + R3.perimeterOfRectangle());
    }
}