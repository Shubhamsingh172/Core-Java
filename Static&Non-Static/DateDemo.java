public class DateDemo {
    public static void main(String[] args)
    {
        Date d1 = new Date();
        d1.showDate();
        Date d2 = new Date();
        d2.setDate(17,3, 2004);
        d2.showDate();
        d2.afterNDays(5);
        d2.showDate();

    }
}
