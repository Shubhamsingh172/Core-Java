public class DateDemo {
    public static void main(String[] args)
    {
        Date d2 = new Date();
        d2.showDate();
        d2.setDate(29,2, 2024);
        d2.showDate();
        d2.afterNDays(5);
        d2.showDate();

    }
}
