package week4_tutorial;

public class Circle1 {
    private double radius;
    private String color;

    public  Circle1(){
    }

    public Circle1(double radius){
        this.radius = radius;
    }

    // return area
    public double getArea(){
        return radius * radius * Math.PI;
    }

    //accessor
    public double getRadius(){
        return radius;
    }

    //mutator
    public void setRadius(double r){
        radius = r;
    }

}
