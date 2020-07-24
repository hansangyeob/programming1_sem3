package week4_tutorial;

public class Circle1 {
    private double radius;
    private String color;
    public  Circle1(){
    }

    //this is constructor
    //Constructors are a special kind of methods that are invoked to construct objects.
    public Circle1(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle1(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color= color;
    }

    // return area
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    //mutator
    public void setRadius(double r){
        radius = r;
    }

    public double calculateCircle1(){
        return 2*Math.PI*this.radius;
    }

}
