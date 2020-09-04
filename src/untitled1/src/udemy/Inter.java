package udemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Inter {

    private int idInter = 000;
    private Date dateOfInteraction;
    private String customerId;
    private String reference;
    private String potential;


    public Inter(int idInter, String customerId, Date dateOfInteraction, String reference, String potential) {
        this.idInter = idInter;
        this.customerId = customerId;
        this.dateOfInteraction = dateOfInteraction;
        this.reference = reference;
        this.potential = potential;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getDateOfInteraction() {
        return dateOfInteraction;
    }

    public int getIdInter() {
        return idInter;
    }

    public String getPotential() {
        return potential;
    }

    public String getReference() {
        return reference;
    }

    public void setcustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setDateOfInteraction(Date dateOfInteraction) {
        this.dateOfInteraction = dateOfInteraction;
    }

    public void setIdInter(int idInter) {
        this.idInter = idInter;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    //Method

    //update id
    public void updateInterId(){
        this.idInter= this.idInter+1;
    }

    //Input DateOfInteraction
    public void inputDOI() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of interaction: ");
        String birthDay = scanner.nextLine();
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yy");
        Date date = sdf.parse(birthDay);
        sdf.format(date);
        this.setDateOfInteraction(date);
    }

    //input customerId
    public void inputCustomerId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer Id:");
        this.setcustomerId(scanner.nextLine());
    }

    //input reference
    public void inputReference(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter reference of user: ");
        this.setReference(scanner.nextLine());
    }

    //input potential
    public void inputPotential(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter potential: ");
        this.setPotential(scanner.nextLine());
    }


    //
    public static Lead displayInterInfo(){
        System.out.printf("lead_%03d,%s,%tF,%b,%s,%s,%s%n",this.getIdInter(),getDateOfInteraction(),getCustomerId(),getReference(),getPotential());
        return null;
    }

}
