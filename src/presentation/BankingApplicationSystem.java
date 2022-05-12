package presentation;

import java.util.Scanner;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char proceed = 'y';

		while (proceed == 'y') {
			System.out.println("*************************************");
			System.out.println("WELCOME TO BANKING APPLICATION SYSTEM");
			System.out.println("*************************************");
			System.out.println("1. Register An New Account");
			System.out.println("2. Login To Existing Account");
			System.out.println("3. Logout");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");

			switch (option) {
			case 1:
				System.out.println("WELCOME TO BANKING APPLICATION SYSTEM");
				System.out.println("*************************************");
				System.out.println("Create a UserName:");
				String name = scan.next();
				System.out.println(name);
				System.out.println("Create a Password:");
				String password = scan.next();
				System.out.println(password);
				System.out.println("Account create successful.");
				System.out.println("Select Option 2 to login to Banking Application System.");
				break;
			case 2:
				break;
			case 3:
				System.out.println("************************************************");
				System.out.println("Thank you for using BANKING APPLICATION SYSTEM!!");
				System.out.println("************************************************");
				System.exit(0);
				break;
			default:
			}
		}
		System.out.println("*******************************************************************");
		System.out.println("Thank you for using BANKING APPLICATION SYSTEM!!");
		System.out.println("*******************************************************************");
		System.exit(0);

	}

}
