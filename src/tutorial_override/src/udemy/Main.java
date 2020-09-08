package udemy;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    private static int customerId = 0;
    private static int interactionId = 0;
    private static SalesPeople salesPeople = new SalesPeople();
    private static Customer customer = new Customer();
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        // receiving User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'man' to see the manual!");
        FileUtils fileUtils = new FileUtils();

        while(true){
            String input = scanner.nextLine();
            switch (input){
                case "man" : {
                    System.out.println("[Manual]\n" +
                            "1 : Add customer info\n" +
                            "2 : Add interaction info\n" +
                            "3 : Update customer info by id\n" +
                            "4 : Update interaction info by id\n"+
                            "5 : Delete customer info by id\n" +
                            "6 : Delete interaction info by id\n"+
                            "7 : Print out all the customer & interaction\n" +
                            "8 : Save ALL information\n" +
                            "0 : Exit this program\n");
                    break;
                }
                case "1" : {
                    System.out.println("Fill out all the values to add customer.");
                    addCustomer();
                    break;
                }
                case "2" : {
                    System.out.println("Fill out all the values to add interaction.");
                    addInteractionInfo();
                    break;
                }
                case "3" : {
                    System.out.print("Enter Customer Id to update : ");
                    Scanner customerIdInput = new Scanner(System.in);
                    String customerId = customerIdInput.nextLine();
                    updateCustomerInfo(customerId);
                    break;
                }
                case"4":{

                    System.out.print("Enter Interaction Id to update : ");
                    Scanner interactionIdInput = new Scanner(System.in);
                    String id = interactionIdInput.nextLine();
                    updateInteractionInfo(id);
                    break;
                }
                case "5" : {
                    System.out.print("Enter customer Id to delete : ");
                    Scanner customerIDInput = new Scanner(System.in);
                    String id = customerIDInput.nextLine();
                    deleteCustomerInfo(id);
                    break;
                }
                case "6":{
                    System.out.print("Enter Interaction Id to delete : ");
                    Scanner interactionIdInput = new Scanner(System.in);
                    String id = interactionIdInput.nextLine();
                    deleteInteractionInfo(id);
                    break;
                }

                case "7" : {
                    System.out.println("printing all customer & interactions ... \n\n");
                    printAllInteractions();
                    printAllCustomer();
                    break;
                }

                case "8" : {
                    fileUtils.saveCustomersToFile(customers);
                    fileUtils.saveInteractionsToFile(salesPeople.getInteractions());
                }

                case "0" : {
                    System.out.println("Good bye. See you soon! ");
                    System.exit(0);
                }
                default:
                    break;
            }
            System.out.println("Enter number of your choice in number: ");
        }
    }

    private static void printAllInteractions() {
        salesPeople.printAllInteractions();
    }

    private static void printAllCustomer(){
        customer.printAllCustomers();
    }

    private static void deleteInteractionInfo(String interactionId) {
        salesPeople.deleteInteraction(interactionId);
    }

    private static void deleteCustomerInfo(String customerId){
        customer.deleteCustomer(customerId);
    }
    private static void updateInteractionInfo(String interactionId) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type update target (date, method ... ) : ");
        String target = s.nextLine();


        System.out.print("Type new information to update : ");
        String newInfo = s.nextLine();

        salesPeople.updateInteraction(interactionId, target, newInfo);
    }

    private static void addInteractionInfo() {
        Scanner interactionInfoInput = new Scanner(System.in);
        Interaction interaction = new Interaction();
        interaction.setId(String.format("inter_%03d", interactionId++));

        System.out.print("Date of interaction (YY/MM/DD) : ");
        String dateOfInteraction = interactionInfoInput.nextLine();
        interaction.setDateOfInteraction(dateOfInteraction);

        System.out.print("Lead Object(Lead id) : ");
        String leadId = interactionInfoInput.nextLine();

        Customer customer = null;
        for (int i = 0; i < customers.size(); i++) {
            if(leadId.equals(customers.get(i).getId())){
                customer = customers.get(i);
            }
        }
        interaction.setCustomer(customer);

        System.out.print("Interaction Method (SNS / email / telephone / face to face) : ");
        String method = interactionInfoInput.nextLine();
        interaction.setInteractionMethod(method);

        System.out.print("Potential (P - positive, NEG - negative, NEU - neutral) : ");
        String potential = interactionInfoInput.nextLine();
        interaction.setPotential(potential);

        boolean isAdded = salesPeople.addInteraction(interaction);
        if(isAdded){
            System.out.println("Interaction added successfully!\n" + interaction);
        }else{
            System.out.println("Interaction add failed !");
        }
    }

    public static void addCustomer(){
        Scanner customerInfoInput = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Enter customer info");

        customer.setId(String.format("lead_%03d", customerId++));

        System.out.print("name : "); //use print function to disable new line
        String name = customerInfoInput.nextLine();
        if(name ==null){
            System.out.println("please enter name!!!");
        }
        customer.setName(name);

        System.out.print("Date of Birth (YY/MM/DD) : ");
        String dateOfBirth = customerInfoInput.nextLine();
        customer.setDateOfBirth(dateOfBirth);

        System.out.print("Gender (Male - 0, Female - 1) : ");
        String gender = customerInfoInput.nextLine();
        customer.setGender(gender);

        System.out.print("Phone Number : ");
        String phoneNumber = customerInfoInput.nextLine();
        customer.setPhoneNumber(phoneNumber);

        System.out.print("Email : ");
        String email = customerInfoInput.nextLine();
        customer.setEmail(email);

        System.out.print("Address : ");
        String address = customerInfoInput.nextLine();
        customer.setAddress(address);

        if(customers.add(customer)){
            // ArrayList.add returns true if the item was added successfully
            System.out.println("Add customer successful! \n" + customer);
        }else{
            System.out.println("Add customer failed!");
        }
    }


    private static void updateCustomerInfo(String customerId) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type update target (name,address,date of birth,gender,phone,email) : ");
        String updateTarget = s.nextLine();

        System.out.print("Type new information to update : ");
        String newInfo = s.nextLine();

        customer.updateCustomer(customerId, updateTarget, newInfo);
    }


}
