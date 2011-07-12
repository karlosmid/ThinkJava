package thinkjava;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karlo
 */
public class Date {

    private int year;

    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the value of year
     *
     * @param year new value of year
     */
    public void setYear(int year) {
        this.year = year;
    }
    protected int month;

    /**
     * Get the value of month
     *
     * @return the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Set the value of month
     *
     * @param month new value of month
     */
    public void setMonth(int month) {
        this.month = month;
    }
    protected int day;

    /**
     * Get the value of day
     *
     * @return the value of day
     */
    public int getDay() {
        return day;
    }

    /**
     * Set the value of day
     *
     * @param day new value of day
     */
    public void setDay(int day) {
        this.day = day;
    }
    public static void main(String[] args){
        Date birthday = new Date(1974,7,5);
        System.out.println(birthday);
}
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
    }

}
