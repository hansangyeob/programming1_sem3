package udemy_tutorial;

public class testPerson {
    public static void main(String[] args) {

        Person PersonalInfor = new Person();

        PersonalInfor.setAge(111);
        PersonalInfor.setFirstName("Han");
        PersonalInfor.setLastName("SANG YEOB");

        System.out.println("Your age is "+ PersonalInfor.getAge());
        System.out.println("Your full name is "+PersonalInfor.getFullName());
    }
}

