package udemy_tutorial;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class WriteStudentsInfo {
    public static void main(String[] args) throws IOException{
        String name,address,fileName;
        int age;
        System.out.println("Enter the name of the file : ");
        Scanner console = new Scanner(System.in);
        fileName = console.nextLine();
        PrintWriter pw = new PrintWriter(new File(fileName));
        do {
            System.out.println("Enter name : ");
            name = console.nextLine();
            System.out.println("Enter address: ");
            address = console.nextLine();
            System.out.println("Enter age: ");
            age = console.nextInt();
            pw.println("" + name + "\t" + address + "\t" + age);
            System.out.println("Continue Y/N ?");
        } while(console.nextLine().charAt(0)=='Y');
        pw.close();

        }
    }




