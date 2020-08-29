package udemy_tutorial;

public class Shape {
    public String color;
    public double radius;

    public Shape(String color,double radius){
        this.color = color;
        this.radius = radius;
    }

    public double getArea(){
        return 0;
    }

    public double getCircumference(){
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
