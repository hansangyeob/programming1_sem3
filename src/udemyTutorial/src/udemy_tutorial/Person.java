package udemy_tutorial;

public class Person {

    String firstName;
    String lastName;
    int age;

    //getter method
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    //setter method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (0<age && age<100){
            this.age = age;
        }else{
            System.out.println("Enter age around 0 to 100");
        }
    }

    public static boolean isTeen(int age){
        if (12<age && age<20){
            return true;
        }else{
            return false;
        }
    }
    public String getFullName(){
        String fullName = lastName + firstName;
        if(firstName =="" || lastName==""){
            return fullName;
                }
        return fullName;

    }


}
