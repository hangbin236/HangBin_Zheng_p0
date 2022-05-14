package presentation;

import java.util.Scanner;

import exception.SystemException;
import model.UserPojo;
import service.UsersService;
import service.UsersServiceImpl;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		UsersService userService = new UsersServiceImpl();

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
				UserPojo newUserPojo = new UserPojo();
				System.out.println("WELCOME TO BANKING APPLICATION SYSTEM");
				System.out.println("*************************************");
				System.out.println("Create a UserName:");
				scan.nextLine();
				newUserPojo.setUsername(scan.nextLine());
				System.out.println("Create a Password:");
				scan.next();
				newUserPojo.setPassword(scan.nextLine());

				UserPojo UserPojo = null;
				try {
					UserPojo = userService.addUsers(newUserPojo);
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}

				System.out.println("Account create successful. \nUser Id is : " + UserPojo.getUserId());
				System.out.println("Select Option 2 to login to Banking Application System.");
				break;
			case 2:
				UserPojo compareUserPojo = new UserPojo();
				System.out.println("Enter your UserName:");
				scan.nextLine();
				compareUserPojo.setUsername(scan.nextLine());
				System.out.println("Enter your Password:");
				scan.next();
				compareUserPojo.setPassword(scan.nextLine());
				
				

				System.out.println("Account Sign in. \nUser Id is : " + compareUserPojo.getUserId());
				
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
