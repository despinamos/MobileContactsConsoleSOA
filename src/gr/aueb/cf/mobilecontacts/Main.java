package gr.aueb.cf.mobilecontacts;

import gr.aueb.cf.mobilecontacts.controller.MobileContactController;
import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;

import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static final MobileContactController controller = new MobileContactController();

    public static void main(String[] args) {

        String choice;

        while(true) {

            printMenu();
            choice = getToken();

            if ((choice.equals("q")) || (choice.equals("Q"))) {
                break;
            }

            handleChoice(choice);
        }
    }

    public static void handleChoice(String choice) {

        String firstname;
        String lastname;
        String phoneNumber;
        String response;

        switch (choice) {
            case "1":
                System.out.println("Please enter Firstname, Lastname, Phone Number");
                firstname = getToken();
                lastname = getToken();
                phoneNumber = getToken();
                MobileContactInsertDTO insertDTO = new MobileContactInsertDTO(firstname, lastname, phoneNumber);
                response = controller.insertContact(insertDTO);

                if(response.startsWith("OK")) {
                    System.out.println("Successful Insert");
                    System.out.println(response.substring(3));
                } else {
                    System.out.println("Failed Insert");
                    System.out.println(response.substring(7));
                }
                break;
            case "2":
                //
                break;
            case "3":
                //
                break;
            case "4":
                //
                break;
            case "5":
                //
                break;
            default:
                //
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Insert contact");
        System.out.println("2: Update contact");
        System.out.println("3. Delete contact");
        System.out.println("5. View contacts");
        System.out.println("Q/q. Exit");
    }

    public static String getToken() {
        return in.nextLine().trim();
    }
}
