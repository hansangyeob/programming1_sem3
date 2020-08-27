package udemy_tutorial;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       // putArray(5);

        int[] tony= {1,2,3,4,5,6,7,8};
        System.out.println("Original array: "+ Arrays.toString(tony));
        reverse(tony);
        System.out.println("Reversed array: "+ Arrays.toString(tony));

    }

    private static int[] putArray(int numbers){
        System.out.println("Type "+numbers+ " you wish to put in an array: \r");
        int[] newArray = new int[numbers];

        for(int i=0;i<newArray.length;i++){
            newArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private static void reverse(int[] array){
//        for(int i=0;i<array.length /2 ;i++){
//            int temp = array[i];
//            array[i] = array[array.length-i-1];
//            array[array.length-i-1] = temp;
//        }
//
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;

        for(int i=0; i< halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
