package week4_tutorial;

public class Car2 {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    //defining 5 fields

    //making method to update model
    // using this method, user dont need to access into field directly
    public void setModel(String model){
        // up model is field but this model is parameter(매개견수)
        //so we use "this" to refer model on the field
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter
    public String getModel(){
        return this.model;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
