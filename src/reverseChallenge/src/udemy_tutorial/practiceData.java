package udemy_tutorial;

import java.util.Scanner;
import java.util.ArrayList;

public class practiceData {
        private static Scanner scanner = new Scanner(System.in);
        private ArrayList<String> groceryList = new ArrayList<String>();
        //array list is a class. therefore, it can have it's own constructor.


    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size()+" in your grocery list.");
        //size() will return how many items are stored in the array list
        for(int i =0; i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

        public void modifyGroceryItem(int position, String newItem){
            groceryList.set(position, newItem);
            System.out.println("Grocery item "+ (position+1)+" have been modified.");
        }

        public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

        }

        public String findItem(String searchItem){
            //boolean exists = groceryList.contains(searchItem);
            int position = groceryList.indexOf(searchItem);
            if(position >= 0){
                return groceryList.get(position);
            }
            return null;
        }
}
