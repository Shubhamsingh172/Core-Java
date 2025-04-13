public class Date1pr {
    int day;
    int month;
    int year;
    static int months[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    Date1pr() {
        day = month = year;
    }

    Date1pr(int dd, int mm, int yy) {
        if (yy % 400 == 0 || yy % 4 == 0 && yy % 100 != 0)
            months[2] = 29;
        else
            months[2] = 28;

        if (dd < 1 || dd > months[mm])
            dd = 1;

        day = dd;
        month = mm;
        year = yy;
    }

    void setDate1(int dd, int mm, int yy) {
        if (yy % 400 == 0 || yy % 4 == 0 && yy % 100 != 0)
            months[2] = 29;
        else
            months[2] = 28;

        if (dd < 1 || dd > months[mm])
            dd = 1;
        day = dd;
        month = mm;
        year = yy;
    }

    Date1pr theNextDay()
    {
        Date1pr temp = new Date1pr(this.day, this.month, this.year);
        temp.day++;
        if(temp.day > months[temp.month])
        {
            temp.day = 1;
            temp.month++;
            if(temp.month > 12)
            {
                temp.month = 1;
                temp.year++;
            }
        }
        return temp;
    }
    Date1pr afterNDays(int n)
    {
        Date1pr temp = new Date1pr(this.day, this.month, this.year);
        for(int i = 0; i < n; i++)
            temp = temp.theNextDay();
        return temp;
    }

    void showDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
