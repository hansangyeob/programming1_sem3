package a2_programming_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Manage {

    private static Scanner scanner = new Scanner(System.in);

    private ArrayList<String> managementList = new ArrayList<String>();

    // adding new Lead id
    public void addLead(String Lead){
        int i =0;
        managementList.add(Lead+"_"+i);
        i++;
        // how to print lead_000??????????????
    }

    //adding new Inter id
    public void addInter(String inter_id){
        //,Date year,boolean gender,String phoneNumber,String email,String address
        int i = 0;
        //how to add gender into boolean?
        managementList.add(inter_id+"_"+i);
        i++;
        // inter_000????????
    }

    //print out list of lead
    public void printLeadList(){
        System.out.println("We have " + managementList.size()+" lead member in the list.");
        for(int i=0;i<managementList.size();i++){
            System.out.println((i+1) +". "+ managementList.get(i));
        }
    }

    //print out list of inter
    public void printInterList(){
        System.out.println("We have " + managementList.size()+" inter member in the list.");
        //size() will return how many items are stored in the array list
        for(int i=0;i<managementList.size();i++){
            System.out.println((i+1) +". "+ managementList.get(i));
        }
    }


    //modify lead information
    public void modifyLead(int position, String newLead){
        managementList.set(position,newLead);
        System.out.println("");
    }
    //?? how to access to details?

    //remove people using id
    public void removeList(Object id){
        Object theId = managementList.indexOf(id);
        managementList.remove(id);
    }


}

