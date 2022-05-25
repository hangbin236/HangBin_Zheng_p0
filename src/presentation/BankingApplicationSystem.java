package presentation;

import java.util.Scanner;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;
import service.AccountsService;
import service.AccountsServiceImpl;
import service.UsersService;
import service.UsersServiceImpl;

public class BankingApplicationSystem {

	public static void main(String[] args) throws SystemException {

		Scanner scan = new Scanner(System.in);

		UsersService userService = new UsersServiceImpl();

		AccountsService accountsService = new AccountsServiceImpl();

		UserPojo user = null;
		AccountsPojo accountInfo = null;

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
				newUserPojo.setUsername(scan.next());
				System.out.println("Create a Password:");
				scan.nextLine();
				newUserPojo.setPassword(scan.next());
				System.out.println("Enter Checking or Saving account:");
				scan.nextLine();
				String userType = scan.next();

				try {
					user = userService.addUsers(newUserPojo);
					accountInfo = accountsService.addAccount(userType, newUserPojo.getUserId());
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}

				System.out.println("User create successful. \nUser Id is : " + user.getUserId());
				System.out.println("Account create successful. \nAccount Id is : " + accountInfo.getAccountId());
				System.out.println("Select Option 2 to login to Banking Application System.");
				break;
			case 2:

				UserPojo userLoginPojo = new UserPojo();
				System.out.println("Enter your UserName:");
				userLoginPojo.setUsername(scan.next());
				scan.nextLine();
				System.out.println("Enter your Password:");
				userLoginPojo.setPassword(scan.next());
				scan.nextLine();

				try {
					user = userService.checkLoginInfo(userLoginPojo, userLoginPojo.getPassword());
					accountInfo = accountsService.getAccountInfo(user);

				} catch (SystemException e) {
					System.out.println("**********************************");
					System.out.println("Sorry!! There is some issue with the database...");
					System.out.println("Please try after sometime....");
					System.out.println("**********************************");
					break;
				}
				if (user == null) {
					System.out.println("**********************************");
					System.out.println("Login failed!");
					System.out.println("**********************************");
					break;
				} else if (user != null) {
					char proceed1 = 'y';
					while (proceed1 == 'y') {
						System.out.println("**********************************");
						System.out.println("**********************************");
						System.out.println("Please select one opion below: ");
						System.out.println("1. View Balance ");
						System.out.println("2. Deposit Money ");
						System.out.println("3. Withdraw Money ");
						System.out.println("4. Log out ");
						System.out.println("*****************************");
						System.out.println("Please enter an option:");
						int option1 = scan.nextInt();
						System.out.println("*****************************");

						switch (option1) {
						case 1:

							System.out.println("Your account balance is: $" + accountInfo.getBalance());

							break;
						case 2:

							System.out.println("Please enter how much you want to deposit to your bank account:");
							double deposit = scan.nextDouble();

							try {
								accountInfo = accountsService.updateBalance(accountInfo, deposit);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}

							System.out.println("You deposit $" + accountInfo.getBalance() + " to your bank account.");
							System.out.println("Your new balance is $" + accountInfo.getBalance());
							break;
						case 3:
							System.out.println("Please enter how much you want to withdraw from bank account:");
							double withdraw = scan.nextDouble();
							if (accountInfo.getBalance() <= 0) {
								System.out.println("Cannot withraw a negative amount");
								break;
							} else if (withdraw > accountInfo.getBalance()) {
								System.out.println("Cannot withraw an amount more than in account");
								break;
							}
							try {
								accountInfo = accountsService.updateBalance(accountInfo, -withdraw);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}

							System.out
									.println("You withdraw $" + accountInfo.getBalance() + " from your bank account.");
							System.out.println("Your new balance is $" + accountInfo.getBalance());
							break;
						case 4:
							System.out.println("************************************************");
							System.out.println("Thank you for using BANKING APPLICATION SYSTEM!!");
							System.out.println("************************************************");
							System.exit(0);
							break;
						default:
						}
					}

					break;
				}

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
		scan.close();
		System.exit(0);

	}

}
