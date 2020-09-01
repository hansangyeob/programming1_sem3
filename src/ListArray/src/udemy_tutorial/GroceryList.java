package udemy_tutorial;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    //() is added because arraylist is a class so it can have
    // constructor

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" in the List!");

        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) +". "+ groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item" + (position+1) +" has been modified ");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        // when we delete No.2, No.3 will automatically move to
        // upper level
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
//        return null;
        int position = groceryList.indexOf(searchItem);
            if(position>0){
                return groceryList.get(position);
            }
            return null;
    }

}
