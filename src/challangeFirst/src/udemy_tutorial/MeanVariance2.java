package udemy_tutorial;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;


public class MeanVariance2 {

    public static void main(String[] args) {

//        try {
//            int a = 1;
//            float b = 1 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("divided by zero");
//            return;
//        } finally {
//            System.out.println("finally will run nomatter what");
//        }
        // why we need to use final?!

    }



    public static Scanner openFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("some-file.txt"));
        return scanner;
    }


public static int numberOfLines(Scanner scanner){
    int lines = 0;
    while (scanner.hasNext()){
        String s = scanner.nextLine();
        lines++;
    }
    scanner.close();
    return lines;
}
}

