package udemy_tutorial;

public class test {
    public static void main(String[] args) {
        SimpleCalculator Tony = new SimpleCalculator();
        Tony.setFirstNumber(10.11);
        Tony.setSecondNumber(11.22);

        System.out.println("Adding first number and second number is "+ Tony.getAdditionResult());
        System.out.println("Subtracted result is " + Tony.getSubtractResult());
        System.out.println("Multiplication result is" + Tony.getMultiplicationResult());
        System.out.println("Divided result is" + Tony.getDivisionResult());


    }
}
