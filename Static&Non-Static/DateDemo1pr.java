

public class DateDemo1pr {
    public static void main(String[] args)
    {
        Date1pr d = new Date1pr();
        System.out.println("D");
        d.showDate();
        d.setDate1(31,1,2024);
        d.showDate();
        
        System.out.println("\nD1");
        /*
        SHORT ANSWER:
            ➤ Bhai sab methods call ho rahe hain — lekin:
            showDate() void method hai → bas print karta hai ✅

            afterNDays() aur theNextDay() new object return karte hain → par tum result ko ignore kar rahe ho ❌

            Isliye lag raha hai "method call nahi ho raha" — par ho toh raha hai!
         */
        Date1pr d1 = d.theNextDay();
        d1.showDate();
        d1.afterNDays(365);

        System.out.println("\nD2");
        Date1pr d2 = d.afterNDays(365);
        d2.showDate();
    }
}
