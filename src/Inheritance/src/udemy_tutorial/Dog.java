package udemy_tutorial;

public class Dog extends Animal{

    // we need to make sure that Dog class have
    // constructor for another class

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;
    // this is features for dog only


    public Dog(String name, int size, int weight, int eyes,int legs,
               int tails, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;

    }
    // call the class for constructor
    // but we can add more features for Dog in here.

        private void chew(){
            System.out.println("Dog can chew!");
        }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){

        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

}
