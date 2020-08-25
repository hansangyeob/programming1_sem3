package udemy_tutorial;
import java.util.Arrays;

public class referenceValue {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value is "+ myIntValue);
        System.out.println("another int value is "+ anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value is "+ myIntValue);
        System.out.println("another int value is "+ anotherIntValue);

// array is an reference type.
//
        int[] myIntArray = new int[5];
        // in here, it is in memory
        int[] anotherArray = myIntArray;
        // in here, we are referencing to memory that is
        System.out.println("My int array is "+ myIntArray);
        System.out.println("another array is "+ anotherArray);
        System.out.println("myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("Modified array is "+ Arrays.toString(myIntArray));
    }

    private static void modifyArray(int[] array){
        array[0] =2;
    }

}
