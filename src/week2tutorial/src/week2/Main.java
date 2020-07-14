package week2;
import java.util.Scanner; // import the Scanner class

public class Main {

    public static void main(String[] args) {
        //System.out.println(returnLargerNumber(12,14));
        //System.out.println(studentMark(22));
        //System.out.println(isItTriangle(4,4,4));
       // System.out.println(convertInto('s'));
        //oneToTen(); //Q 2.1
        //sumOneToTen(); //Q 2.2
        //multipleTable(); //Q 2.3
        //factorial(); //Q2.4
            powerUp();



    }//main close

    /*
    //0. Write a static method that accepts 2 numbers. Return the larger number.
    public static int returnLargerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the larger number than " + b);
            return a;
        } else {
            System.out.println(b + " is the larger than " + a);
            return b;
        }

}
*/

    /*
    //1. Write a static method to return student grades  (HD, DI, CR, PA or NN).
    // Input is students marks between 0 and 100.
  public static String studentMark(int a){
      if(90<= a && a <=100){
          return "HD";
      }else if (70<=a && a<90){
          return "DI";
      }else if (60<=a && a<70){
          return "CR";
      }else if(50<=a && a<60){
          return "PA";
      }else{
          return "NN";
      }
  }
*/

    /*
    //2. Write a static method to check if three sides of a triangle is valid. Input: a, b, c
 public static String isItTriangle(int a,int b, int c){
     if (a+b>c && b+c>a && a+c>b){
         return "it is triangle!";
     }else{
         return "it is not a triangle!";
     }
 }
 */
    /*
//3. Write a static method to convert 7 characters to full dates: m --> Monday, t -> Tuesday, h -> Thursday,  s ->Sunday, a -> Saturday. Input a character
public static String convertInto(char letter){

    if( letter == 'm'){
        return "Monday";
    }if(letter == 't' ){
        return "Tuesday";
    }if (letter == 'h'){
        return "Thursday";
    }if (letter == 's'){
        return "Sunday";
    }if(letter == 'a'){
        return "Saturday";
    }else{
        return "Users input is incorrect!";
    }

    }
     */

// Q2.1

//    public static void oneToTen(){
//
//        for(int n=1;n<11;n++){
//            System.out.println("This is a "+n +"8th number");
//        }
//    }

    //Q2.2

//    public static void sumOneToTen(){
//        int n =1;
//        int sumN = 0;
//        while(n<11){
//            sumN = sumN+n;
//            n++;
//        }
//        System.out.println(sumN);
//    }


    //Q2.3

//        public static void multipleTable(){
//        Scanner userInput = new Scanner (System.in);   //Create a Scanner object
//        System.out.println("Enter a number that you wish to see the multiple table");
//
//        int n=0;
//        int userInputNumber = userInput.nextInt(); //Read user input
//        while (n<10){
//        n++;
//        int userInputResult = userInputNumber * n;
//        System.out.println(userInputNumber+"*"+n+" ="+userInputResult); //Output user input
//        }
//    }
   //Q 2.4 i dont know!!

   //Q 2.5
   public static void powerUp(){
       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter your base");
       int userInputNumberFirst = userInput.nextInt();

       System.out.println("Enter your power");
       int userInputNumberSecond = userInput.nextInt();

       int p = userInputNumberFirst;
       for (int i = 0; i < userInputNumberSecond -1; i++){
           p *= userInputNumberFirst;
       }
       System.out.println(p);
   }
}// Main class close

