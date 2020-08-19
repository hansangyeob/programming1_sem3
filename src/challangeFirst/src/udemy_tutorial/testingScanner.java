package udemy_tutorial;
import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;

public class testingScanner {

    public static void main(String[] args) {
        Date a = new Date();
        Random model = new Random(500);

        System.out.println(a.toString());
        System.out.println(a.getTime());
        System.out.println(a);

        System.out.println(model.nextInt(1000));

        try {
            int[] myNumber = {1, 2, 3};
            System.out.println(myNumber[2]);
        } catch (Exception ex) {
            System.out.println("Something is wrong dude!");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
        checkAge(19);

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(i + " ");
                System.out.println(1 / 0);
            }
        } catch (Exception ex) {
            System.out.println("Isnt is Arithmetic error? ");
        }

        long valueNormal = Long.MAX_VALUE - 1;
        long value = Long.MIN_VALUE + 1;
        System.out.println(valueNormal);
        System.out.println(value);

        try {
            int valueMine = 50;
            if (valueMine < 40)
                throw new Exception("valueMine is too  small”");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("“Continue after the catch block”");
        try {
            int [] list = new int[10];
            System.out.println ("“ list[10]  is”" + list[10]);
        }
        catch (ArithmeticException ex) {
            System.out.println("“Arithmetic Exception”"); }
        catch (RuntimeException ex) {
            System.out.println ("“Runtime Exception”"); }

        catch (Exception ex) {
            System.out.println("“Exception”"); }
    }


    static void checkAge(int age){
        if( age<18) {
            throw new ArithmeticException("Access denided");
        }else {
            System.out.println("You are old enough");
        }
        }
        }



