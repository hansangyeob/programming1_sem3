package week2;

public class Main {

    public static void main(String[] args) {
        //System.out.println(returnLargerNumber(12,14));
        //System.out.println(studentMark(22));
        //System.out.println(isItTriangle(4,4,4));
        System.out.println(convertInto('s'));



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
}// Main class close

