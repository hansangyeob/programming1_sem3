package udemy_tutorial;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        for(int i = 0; i<myInteger.length; i++){
            System.out.println("element" + i + ", typed value was"+ myInteger[i]);
        }

        System.out.println("The average is" + getAverage(myInteger));
    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter"+ numbers+ "integer values.\r");
        int[] values = new int [numbers];
        for(int i=0;i< values.length;i++){
            values [i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}