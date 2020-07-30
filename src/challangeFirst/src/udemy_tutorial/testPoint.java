package udemy_tutorial;


public class testPoint {

    public static void main(String[] args) {
        Point testingPoint = new Point();

        testingPoint.setX(10);
        testingPoint.setY(10);

        System.out.println(testingPoint.distance(2,4));
    }

}
