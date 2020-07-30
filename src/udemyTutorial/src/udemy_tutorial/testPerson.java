package udemy_tutorial;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;

public class testPerson {
    public static void main(String[] args) {

        Person PersonalInfor = new Person();
        Random randomFirst = new Random();

        PersonalInfor.setAge(111);
        PersonalInfor.setFirstName("Han");
        PersonalInfor.setLastName("SANG YEOB");

        System.out.println("Your age is "+ PersonalInfor.getAge());
        System.out.println("Your full name is "+PersonalInfor.getFullName());
        System.out.println(PersonalInfor.toString());
        System.out.println(randomFirst.nextInt(100));

    }
}

