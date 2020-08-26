package udemy_tutorial;

import java.util.Scanner;
import java.util.Arrays;

public class elementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = readInteger(5);
        System.out.println(Arrays.toString(array));
        findMin(array);

    }
    private static int[] readInteger(int count){
        System.out.println("Type the numbers you wish to put in array: \r");
        int[] newArray = new int[count];
        for(int i=0;i<newArray.length;i++){
            int number = scanner.nextInt();
            newArray[i] = number;
        }
        return newArray;
    }

    private static int findMin(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Minimum value in this array is"+minValue);
        return minValue;
    }
}
