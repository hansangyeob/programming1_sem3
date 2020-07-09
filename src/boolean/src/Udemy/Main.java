/*
1. 'char' is similar to 'string' but it can only save upto 1 charector
    - two bytes (16 bits) width of 16
    - it can save 'unicode'
*/

package Udemy;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myUnicodeChar2 = '\u00a9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeChar2);

        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;

        boolean isCustomerOverTwentyOne = true; //we can name the variable like that
    }
}
