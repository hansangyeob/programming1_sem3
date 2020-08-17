package udemy_tutorial;
import java.util.Scanner;

public class testingScanner {

    public static void main(String[] args) {
        Circle thisCircle = new Circle();

        thisCircle.setColor("Red");
        System.out.println(thisCircle.getColor());

        thisCircle.setRadius(19.2);
        System.out.println(thisCircle.getRadius());
        System.out.println(thisCircle.calculate());
    }

  }
