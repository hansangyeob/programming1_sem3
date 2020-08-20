package udemy_tutorial;
import java.util.Random;
import java.util.Scanner;

public class MeanVariance2 {

    public static void main(String[] args) {
        Random rand1 = new Random();
        int [] data = new int[100000000];
        int i;

        for (i = 0; i < data.length; i++) {
            data[i] = 20 + rand1.nextInt(80);   // [20..99]
        }

        int n = data.length;
        int d;
        double diff;
        double sum;
        double sum2;
        double mean;
        double variance;
        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.currentTimeMillis();
        // First Method (fetch the data twice)
        sum = 0;
        for (i = 0; i < n; i++) {
            sum += data[i];
        }
        mean = sum / n;
        sum2 = 0;   // sum(x[i] - mean)^2
        for (i = 0; i < n; i++) {
            diff = data[i] - mean;
            sum2 += diff*diff;
        }
        endTime = System.currentTimeMillis();
        System.out.printf("The mean of %d data is %1.4f.\n",n,mean);
        variance = sum2 / n;
        System.out.printf("The variance of %d data is %1.4f.\n",n,variance);
        elapsedTime = endTime - startTime;
        System.out.printf("The elapsed time is %d ms.\n",elapsedTime);

        // Second method
        System.out.printf("Now using the second method....\n");
        sum = 0;
        sum2 = 0;
        startTime = System.currentTimeMillis();
        for (i = 0; i < n; i++) {
            d = data[i];
            sum += d;
            sum2 += d * d;
        }
        endTime = System.currentTimeMillis();
        mean = sum / n;
        variance = (sum2 - (sum*sum)/n) / n;
        System.out.printf("The mean of %d data is %1.4f.\n",n,mean);
        System.out.printf("The variance of %d data is %1.4f.\n",n,variance);
        elapsedTime = endTime - startTime;
        System.out.printf("The elapsed time is %d ms.\n",elapsedTime);
    }

}
