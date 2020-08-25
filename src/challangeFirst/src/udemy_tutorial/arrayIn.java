package udemy_tutorial;

import java.util.Scanner;

public class arrayIn {
 private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] doubleArray=  getArray(2);

        getAverage(doubleArray);

        for(int i=0;i<doubleArray.length;i++){
            System.out.println("element in "+i+"is "+ doubleArray[i]);
        }
    }

    public static double[] getArray(int numbers){
        System.out.println("Type the numbers: ");
        double[] actualDoubleArray = new double[numbers];
        for(int i=0;i<actualDoubleArray.length;i++){
            actualDoubleArray[i]=scanner.nextDouble();
        }
        return actualDoubleArray;
    }

    public static double getAverage(double [] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum+= array[i];
        }
        return (double)sum/(double)array.length;
    }

}
