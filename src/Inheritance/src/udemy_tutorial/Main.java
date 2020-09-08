package udemy_tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("TONY",6,2,3,1,2,4,"LONG");

        animal.eat();
        dog.eat();
        dog.walk();
        dog.run();

    }
}
