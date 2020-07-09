// string is a sequence of characters

package Udemy;

public class Main {

    public static void main(String[] args) {
	    // byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is my string!";
        System.out.println(myString);

        String numberString = "255.55";
        System.out.println(numberString);
        numberString = numberString+ " 400.2442";
        System.out.println(numberString);
        int myInt = 50;
        numberString += myInt;
        System.out.println(numberString);

        double doubleNumber = 140.123;
        numberString += ", " + doubleNumber;
        System.out.println(numberString);

    }
}
