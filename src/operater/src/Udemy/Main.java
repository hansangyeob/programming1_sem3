//operators
/*
 operand
 int myVar = 15+12;
 1. "+" is operator
 2. 15,12 are operands
* */
package Udemy;

public class Main {

    public static void main(String[] args) {
        double firstVar = 20.00d;//Q1
        double secondVar = 80.00d;//Q2

        double thirdQuestion = (firstVar +secondVar) * 100.00;
        double theRemainder = thirdQuestion%40.0;//Q4
        System.out.println(thirdQuestion);//Q3
        System.out.println(theRemainder);


        boolean isRemainder0 = thirdQuestion == 0? true:false;


        if (isRemainder0 ==true){
            System.out.println("1");

        }else {
            System.out.println("0");
            System.out.println("Got some remainder");
        }


    }//2

}//1




/*
        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println("PreviousResult = " + previousResult);
        result = result - 1;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an aline!");
        }else{
                System.out.println("It is an aline!!");
            }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20? true:false;
        System.out.println(isEighteenOrOver);


*/
