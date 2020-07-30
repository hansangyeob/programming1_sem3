package udemy_tutorial;

import java.lang.*;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Initialise Point class");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int newX, int newY) {

        System.out.println("Distance between (0,0) and " + "(" + x + "," + y + ")" + "is" + Math.sqrt((newX-x)*(newX-x)+(newY-y)*(newY-y)));
        return x;
    }


}
