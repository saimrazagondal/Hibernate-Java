package saim.lab7;

import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);  //Scanner object for input
    person per;                             //person instance
    int choice, id;                     //variables to store choice of user and id of record for update and delete purposes


    //Constructor
    public Main(){

        //Object of DAO class
        personDAO DAO = new personDAO();

        /*
         * Ask user for choice of action
         * Perform task based on that choice
         */
        System.out.println("Enter number corresponding to your choice of action:\n1-Register:\n2-Update:\n3-Retrieve:\n4-Delete:");
        choice=scan.nextInt();
        scan.nextLine();

        switch (choice){
            case 1:
                per = getInfo();
                DAO.register(per);
                break;

            case 2:
                System.out.println("Please enter corresponding id: ");
                id = scan.nextInt();
                scan.nextLine();
                per = getInfo();
                per.setId(id);
                DAO.update(per);
                break;

            case 3:
                System.out.println("Please enter corresponding id: ");
                id = scan.nextInt();
                scan.nextLine();
                per = DAO.retrieve(id);
                printPerson(per);
                break;

            case 4:
                System.out.println("Please enter corresponding id: ");
                id = scan.nextInt();
                scan.nextLine();
                DAO.delete(id);
                break;

            default:
                System.out.println("Invalid number entered!\nExiting Application....");
        }
    }

    /*
     * Get information about a person and return an object
     */
    public person getInfo(){
        String name, fatherName, organization, mobile, username, password;

        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("Enter father name: ");
        fatherName = scan.nextLine();
        System.out.println("Enter organization: ");
        organization = scan.nextLine();
        System.out.println("Enter mobile: ");
        mobile = scan.nextLine();

        return new person(name, fatherName, organization, mobile);
    }



    /*
     * Takes in a person object
     * Prints out the person object attributes using getter methods
     */
    public void printPerson(person per){
        System.out.println("\nName: " + per.getName() +
                "\nFather Name: " + per.getFatherName() +
                "\nOrganization: " + per.getOrganization() +
                "\nMobile: " + per.getMobile() + "\n\n");
    }



    /*
     * Main method
     */
    public static void main(String[] args) {
        new Main();
    }

}
