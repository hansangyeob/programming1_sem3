/*
1. Primitive Types are the most basic data types
  - boolean
  - byte
  - char
  - short
  - int
  - long
  - float
  - double

2. Java packages
 - a package is a way to organize your java projects.
3. Wrapper classes
  -MIN_VALUE
  -MAX_VALUE
4. Size of Primitive Types and Width
   - Byte occupies 8 bits which has a width of 8
   - short occupies 16 bites which has a width of 16
   - int occupies 32 bites which has a width of 32
   ## is useful to know that certain datatype takes more space than others
5. Casting in Java
    - Casting means to treat or convert a number from one type to another
*/

package Udemy;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMixIntValue =Integer.MAX_VALUE;
        System.out.println(myMinIntValue);
        System.out.println(myMixIntValue);

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        int myTotal = (myMinIntValue /2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        System.out.println("casting down with byte: " + myNewByteValue);


        byte challengeOne = 100;
        short challengeTwo = 200;
        int challengeThree = 300;


        long challengeSum = ((challengeOne + challengeTwo + challengeThree)) *10L + 50000L;

        long longTotal = 50000L + 10L * (challengeOne + challengeTwo + challengeThree);
        System.out.println(challengeSum);
        System.out.println(longTotal);




    }
}
