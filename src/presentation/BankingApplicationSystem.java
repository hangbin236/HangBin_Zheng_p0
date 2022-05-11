package presentation;

import java.util.Scanner;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char proceed = 'y';

		System.out.println("*****************************");
		System.out.println("BANKING APPLICATION SYSTEM");
		System.out.println("*****************************");
		System.out.print("UserName: ");
		String name = scan.nextLine();

		System.out.print("Password: ");
		String password = scan.nextLine();

		System.out.println("*****************************");
		System.out.println("login successful.");

		while (proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("WELCOME TO BANKING APPLICATION SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. Depsit Funds");
			System.out.println("2. WithDraw Funds");
			System.out.println("3. View Balance");
			System.out.println("4. ");
			System.out.println("5. Exit");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");

			switch (option) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("*******************************************************************");
				System.out.println("Thank you for using BANKING APPLICATION SYSTEM!!");
				System.out.println("*******************************************************************");
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
