/*
1. why do we need various data type?
 - to save the storage
 - all uses to store integer numbers
 ex. 1) byte 8-bite
     2) short 16-bite
     3) int 32-bite
     4) long 64-bite
     5) float 32-bite IEEE 754
        - floating numbers. 33.3333333......
     6) double 64-bite TEEE 754

 2. number operator
     1. / : division
     2. % : remainder
 3. Type casting
        int i = (int)3.9

 4. System.out.println("hello! \"TONY\"");

*/

package week2;

public class Main {
/*
    public static void main(String[] args) {
        switch ('a') {
            case 'a': System.out.println('a');
                break;
            case 'b': System.out.println('b');
                break;
            case 'c': System.out.println('c');
                break;
        }

    }
*/
    /*
    public static void main(String[] args) {
        int count= 0;
        while (count<100){
            System.out.println(count +" .Welcome to Java!");
            count++;
        }

}
*/
public static void main(String[] args) {
        char ch = 'a';
    System.out.println(++ch);
    System.out.println("hello! \"TONY\"");

    int i = 0;
    while (i++<10){
        System.out.println(i);
    }
}
}

