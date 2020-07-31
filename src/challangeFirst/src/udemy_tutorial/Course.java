package udemy_tutorial;

public class Course {

    private String code;
    private String name;
    private int numberOfCredits;

    public void Course(){
        //no params constructor
        System.out.println("Initializing Course class");
    }

    public Course(String code, String name){
//        constructor with params
        this.code = code;
        this.name = name;

    }
    public Course(String name){
//        constructor with one param
        this.name = name;

    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
