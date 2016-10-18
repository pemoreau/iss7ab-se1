package date;

public class MyDate {
    private int day;
    private int month;
    private int year;

    /**
     * Constructs a date.
     *
     * @param      day   the day.
     * @param      month   the month.
     * @param      year   the year.
     */
    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    /**
     * Determines if a given (day, month, year) represents a valid date.
     *
     * @param      day   the day.
     * @param      month   the month.
     * @param      year   the year.
     * @return true if (day, month, year) represents a valid date, false else
     */
    public static boolean isValidDate(int day, int month, int year) {
        return checkData(day, month, year);
    }

    /**
     * Determines if a given (day, month, year) represents a valid date.
     *
     * @param      day   the day.
     * @param      month   the month.
     * @param      year   the year.
     * @return true if (day, month, year) represents a valid date, false else
     */
    private static boolean checkData(int day, int month, int year) {
        return checkDay(day) && checkMonth(month) && checkYear(year)
            && checkDayLimits(day, month, year);
    }

    /**
     * Determines if this object represents a valid date.
     *
     * @return true if this object represents a valid date, false else
     */
    public boolean checkData() {
        return checkData(day, month, year);
    }

    /**
     * Get the last day given a month and a year.
     *
     * @param      month   the month.
     * @param      year   the year.
     * @return the last day of (month, year), (should be 28, 29, 30 or 31)
     */
    public static int maxDayOfMonth(int month, int year) {
        int result = 31;
        if ( month == 2 )
            result = ( year%4 == 0 ) ? 29 : 28;
        if ( month == 4 || month == 6 || month == 8 || month == 11 )
            result = 30;
        return result;
    }

    public static int maxDayOfMonth(int month) {
        return maxDayOfMonth(month, 2001);
    }

    /**
     * Updates the day, month and year) attributes of this object
     * to the next day (tomorrow).
     *
     * @return this (my)date
     */
    public MyDate nextDay() {
        // TODO
        return this;
    }
    
    /**
     * Allocates a <code>MyDate</code> object and initializes it to represent
     * the day (tomorrow) which follows the provided day, month and year.
     *
     * @param      day   the day.
     * @param      month   the month.
     * @param      year   the year.
     * @return a (my)date object initialized to next day of (day, month, year)
     */
    public static MyDate nextDay(int day, int month, int year) {
        MyDate date = new MyDate(day, month, year);
        return date.nextDay();
    }
    
    private static boolean checkDayLimits(int day, int month, int year) {
        // TODO Auto-generated method stub
        return true;
    }

    private static boolean checkDay(int day) {
        return day >= 0 && day < 32;
    }

    private static boolean checkMonth(int month) {
        return month > 0 && month < 13;
    }

    private static boolean checkYear(int year) {
        return true;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        year = this.year;
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return day;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    public static void main(String args[]) {
      System.out.println("MyDate");
    }
}
