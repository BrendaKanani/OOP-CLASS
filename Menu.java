package menu;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int option;

	        do {
	            printMainMenu();
	            option = scanner.nextInt();

	            switch (option) {
	                case 0:
	                    handleOption0();
	                    break;
	                case 98:
	                    printMoreOptions();
	                    break;
	                case 99:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        } while (option != 99);
	    }

	    private static void printMainMenu() {
	        System.out.println("Main Menu:");
	        System.out.println("0: Sh20 (30mins, 3hrs)");
	        System.out.println("1: Sh50 (40Mins + 50SMS, 24hrs)");
	        System.out.println("2: Okoa Easy Sh100 (100 Mins, 2days)");
	        System.out.println("3: Okoa 250");
	        System.out.println("4: Okoa 100");
	        System.out.println("5: Okoa 50");
	        System.out.println("6: Okoa 20");
	        System.out.println("7: Okoa 10");
	        System.out.println("8: Okoa 5");
	        System.out.println("98: More");
	        System.out.println("99: Exit");
	        System.out.print("Select an option: ");
	    }

	    private static void handleOption0() {
	        System.out.println("Existing Unpaid Okoa: 0");
	        System.out.println("New Okoa request: 20");
	        System.out.println("TOTAL DEBT will be: 20");
	        System.out.println("1: Accept");
	        System.out.println("2: Decline");
	        System.out.println("0: BACK\n");

	        Scanner scanner = new Scanner(System.in);
	        int subOption = scanner.nextInt();
	        if (subOption == 0) {
	            // Return to the main menu
	            return;
	        }
	        if (subOption == 1) {
	            System.out.println("Accepted Okoa request.");
	        } else if (subOption == 2) {
	            System.out.println("Declined Okoa request.");
	        } else {
	            System.out.println("Invalid option.");
	        }
	    }

	    private static void printMoreOptions() {
	        System.out.println("Additional Options (More):");
	        // Add more options here as needed
	        System.out.println("0: BACK");
	        System.out.print("Select an option: ");
	        Scanner scanner = new Scanner(System.in);
	        int moreOptions = scanner.nextInt();
	        if (moreOptions == 0) {
	            // Return to the main menu
	            return;
	        }
	        // Handle additional options here
	    }
	


	}


