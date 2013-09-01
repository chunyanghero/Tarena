import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       /**        
        * Scanner scanner = new Scanner(System.in);
        * System.out.println("Input the year number: ");
        * int year = (int)scanner.next();  // Error
        */

       int year = 1989;

       if (IsLeapYear(year)) {
         System.out.println(year + " is a leap year!");
       } else {
         System.out.println(year + " is not a leap year!");
       }
    }

    /**
     * public boolean IsLeapYear(int year) {
     *
     * Cannot make a static reference to the not-static method 
     * IsLeapYear(int) from the type LeapYear
     */

    public static boolean IsLeapYear(int year) {
       if ((year % 4 == 0) && (year % 400 != 0)) {
           return true;
       } else if (year % 400 == 0) {
           return true;
       } else {
           return false;
       }
    }
}
