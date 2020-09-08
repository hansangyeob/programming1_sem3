package udemy_tutorial;

public class Circle extends Shape{
        private double radius;
        private String color;

    public Circle (String color,double radius ){
        super("red",5.5);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*this.radius*this.radius;

    }
}
