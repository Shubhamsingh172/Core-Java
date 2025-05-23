public class Date {
    int day;
    int month;
    int year;
    Date()
    {
        day = month = year;
    }
    Date(int dd, int mm, int yy)
    {
        day = dd;
        month = mm;
        year = yy;
    }
    void setDate(int dd, int mm, int yy)
    {
        day = dd;
        month = mm;
        year = yy;
    }
    void nextDay()
    {
        day++;
    }
    void afterNDays(int n)
    {
        for(int i = 0; i < n; i++)
            nextDay();
    }
    void showDate()
    {
        System.out.printf("%02d/%02d/%04d\n",day, month, year);
    }
}
