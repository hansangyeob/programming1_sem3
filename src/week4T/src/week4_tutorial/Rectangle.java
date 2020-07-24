package week4_tutorial;

public class Rectangle {
    private String color;
    private double side_A;
    private double side_B;
    public Rectangle(){

    }

    //constructing method
    public Rectangle(String color, double side_A, double side_B){
        this.color = color;
        this.side_A = side_A;
        this.side_B = side_B;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSide_A(double side_A) {
        this.side_A = side_A;
    }

    public void setSide_B(double side_B) {
        this.side_B = side_B;
    }

    //getter

    public String getColor() {
        return color;
    }

    public double getSide_A() {
        return side_A;
    }

    public double getSide_B() {
        return side_B;
    }

    public double getAreaRec(){
        return side_A * side_B;
    }


}
