package udemy_tutorial;

public class Wall {
    private double width;
    private double height;

    //The first constructor
    public Wall(){
    }

    //The second constructor
    public void Wall(double width, double height){
        if(width<0){
            width=0;
        }if(height<0){
            height=0;
            System.out.println("Initializing class");
        }
    }

    //getter
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    //setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void getArea(){
        double area = width*height;
    }

}
