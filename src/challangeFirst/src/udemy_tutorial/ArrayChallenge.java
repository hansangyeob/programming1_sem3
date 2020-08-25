package udemy_tutorial;

import java.util.Scanner;

public class ArrayChallenge {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getInteger(5);
        int[] sorted = sortInteger(myIntegers);
        printArray(sorted);
    }

    public static int[] getInteger(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity+" integer values: \r");
        for(int i=0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.println("Element " + i +" contents "+ array[i]);
        }
    }

    public static int[] sortInteger(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i =0; i<array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if (sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[1];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
