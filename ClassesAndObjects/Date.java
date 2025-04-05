public class Date {
    int day;
    int month;
    int year;

    void setDate(int day, int month, int year)
    {
        //"this keyword used for " - Distinguish between instance variable and parameter
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void displayDate()
    {
        System.out.printf("%02d/%02d/%04d\n",day,month, year);
    }
}

class DateDemo
{
    public static void main(String[] args) 
    {
        Date d = new Date();
        d.setDate(17,03,2004);   
        d.displayDate();
    }
}
