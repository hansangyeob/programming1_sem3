package week4_tutorial;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //setter!
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("BMW")){
            this.model = model;// referring field of model in the first
        }

    }// putting void it will not return any data

    //getter
    public String getModel(){
        return this.model;
    }

}//end of class
