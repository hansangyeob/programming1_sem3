public class Circle extends Shape{
    public Circle(String color,int radius){
        super(color);
        this.radius = radius;
    }

    private int radius;

    @Override
    public double getArea(){
        return this.radius*3.14;
    };

    @Override
    public String getColor() {
        return super.getColor();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}

