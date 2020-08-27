package udemy_tutorial;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //setter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //getter
    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }


    public double getAdditionResult(){
        double resultAdd = firstNumber+ secondNumber;
        return resultAdd;
    }

    public double getSubtractResult(){
        double resultSubtract = firstNumber - secondNumber;
        return resultSubtract;
    }

    public double getMultiplicationResult(){
        double resultMultiplication = firstNumber * secondNumber;
        return resultMultiplication;
    }

    public double getDivisionResult(){
        double resultDivision = firstNumber / secondNumber;
        return resultDivision;
    }


}
