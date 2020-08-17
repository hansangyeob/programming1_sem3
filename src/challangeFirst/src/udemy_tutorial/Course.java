package udemy_tutorial;

public class Course {

    private String code;
    private String name;
    private String number;



    public Course(String code,String name, String number){
        System.out.println("Initalizing class Course");
        this.code = code;
        this.name = name;
        this.number = number;
    }

    public Course(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
