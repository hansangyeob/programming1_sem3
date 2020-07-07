/*
1. public is an access modifier defining the class
2. static is a Java keyword that needs an understanding of other concepts
3. void is yet another java keyword used to indicate that method will not return anything more on that later.
4. Primitive Types are the most basic data types
  - boolean
  - byte
  - char
  - short
  - int
  - long
  - float
  - double


 */


package Udemy;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello,Tonyy!");
        System.out.println("Hello!!");

        int myFirstNumber = 5; // Defining variable
        // it is Declaration statement
        // Expression is a construct that evaluates to a single value
        int mySecondNumber = 10;
        int myThirdNumber = 15;
        int myAllNumber = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastNumber = myAllNumber - 1000;
        System.out.println(myLastNumber);
        //sout is short cut
        // when we put something in "", it is called string literal

    }
}

