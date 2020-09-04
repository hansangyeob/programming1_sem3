package a2_programming_1;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Manage {

    private static Scanner scanner = new Scanner(System.in);

    private ArrayList <ArrayList<String>> leadList = new ArrayList();
    private ArrayList <ArrayList<String>> interList = new ArrayList();

    ArrayList<String> leadName = new ArrayList();

    // adding new Lead id
    public void addLeadId(String leadId){
        for (int i = 0; i < leadList.size(); i++) {
            System.out.println("lead_"+(i + 1) + leadList.get(i));
        }
    }
    public void addLeadName(String leadName){
        for (int i = 0; i < leadList.size(); i++) {
            System.out.println("lead_"+(i + 1) + leadList.get(i));
        }
    }

    //adding new Inter id
    public void addInter(String inter_id){
        for (int i = 0; i < interList.size(); i++) {
            System.out.println("lead_" + (i + 1) + interList.get(i));
        }
        // inter_000????????
    }

    //print out list of lead
    public void printLeadList(){
        System.out.println("We have " + leadList.size()+" lead member in the list.");
        //size() will return how many items are stored in the array list
        for(int i=0;i<leadList.size();i++){
            System.out.println((i+1) +". "+ leadList.get(i));
        }
    }

    //print out list of inter
    public void printInterList(){
        System.out.println("We have " + interList.size()+" inter member in the list.");
        //size() will return how many items are stored in the array list
        for(int i=0;i<interList.size();i++){
            System.out.println((i+1) +". "+ interList.get(i));
        }
    }


    //modify lead information
//    public void modifyLead(int position, String newLead){
//        leadList.set(position,newLead);
//        System.out.println("");
//    }
    //?? how to access to details?

    //remove people using id
    public void removeList(Object id){
        Object theId = leadList.indexOf(id);
        leadList.remove(id);
    }


}

