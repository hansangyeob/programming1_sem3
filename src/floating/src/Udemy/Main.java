package Udemy;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00; // or 5d/3d

        int pound = 15;
        float oneKilo = 0.45359237f;

        double poundToKilo = (double)oneKilo * pound;

        System.out.println(poundToKilo);

    }

}
