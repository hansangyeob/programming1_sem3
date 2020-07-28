package week4_tutorial;

public class Circle {
    public static void main(String[] args) {
        Car2 porsche = new Car2();//defining type
        //always need to initalize with new
        Car2 hyundai = new Car2();
        // we can treat as a datatype
        porsche.setModel("Carrera");
        // we can access because we put model as public
        System.out.println("Model is "+ porsche.getModel());
    }
}
