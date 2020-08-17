package udemy_tutorial;


public class Circle {
    private String color ;
    private double radius;

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculate(){
        double area = radius * radius * 3.14;
        return area;
    }
}

