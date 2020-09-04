package udemy;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        List seedArrayList = new ArrayList<>();
        seedArrayList.add(1);
        seedArrayList.add(2);
        seedArrayList.add(3);
        System.out.println("Seed ArrayList: " + seedArrayList);

        // Let's create a new ArrayList from existing ArrayList
        List newArrayList = new ArrayList<>(seedArrayList);
        newArrayList.add(4);
        newArrayList.add(5);
        System.out.println("New ArrayList Seeded from an ArrayList: " + newArrayList);

        // Define a collection and add to our ArrayList
        List moreNumbers = new ArrayList<>();
        moreNumbers.add(6);
        moreNumbers.add(7);
        moreNumbers.add(8);

        // Add the collection to our ArrayList
        newArrayList.addAll(moreNumbers);
        System.out.println("Updated ArrayList using Another Collection: " + newArrayList);
    }
}
