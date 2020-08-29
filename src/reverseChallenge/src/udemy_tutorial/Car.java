package udemy_tutorial;

import java.util.ArrayList;

public class Car {

    public static void main(String[] args) {

        Shape shape = new Circle("red",5.5);

        shape.radius();


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
//        System.out.println(cars.get(0));
//        System.out.println(cars.set(0,"Opel"));
//        System.out.println(cars.get(0));
//        System.out.println(cars.remove(0));
//        System.out.println(cars.get(0));

//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);
//        cars.size();
        // to find out how many elements an Arraylist
//        System.out.println(cars);

        // to list all the items
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

        for (String i : cars) {
            System.out.println(i);
        }
    }


}
