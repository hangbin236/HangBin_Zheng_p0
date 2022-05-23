package presentation;

import java.util.List;
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
		
		List<AccountsPojo> newUserBankAccount = null;

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
				int accountType =0;
				UserPojo newUserPojo = new UserPojo();
				AccountsPojo newAccountPojo = new AccountsPojo();
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
				String userType =scan.next();
				
				UserPojo UserPojo = null;
				AccountsPojo accountPojo = null;
				try {
					UserPojo = userService.addUsers(newUserPojo);
					accountPojo = accountsService.addAccount(userType,newUserPojo.getUserId());
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}
				
				System.out.println("User create successful. \nUser Id is : " + UserPojo.getUserId());
				System.out.println("Account create successful. \nAccount Id is : " + accountPojo.getAccountId());
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

				UserPojo returnUserLoginPojo = null;
				try {
					returnUserLoginPojo = userService.checkLoginInfo(userLoginPojo, userLoginPojo.getPassword());

				} catch (SystemException e) {
					System.out.println("**********************************");
					System.out.println("Sorry!! There is some issue with the database...");
					System.out.println("Please try after sometime....");
					System.out.println("**********************************");
					break;
				}
				if (returnUserLoginPojo == null) {
					System.out.println("**********************************");
					System.out.println("Login failed!");
					System.out.println("**********************************");
					break;
				} else if (returnUserLoginPojo != null) {
					char proceed1 = 'y';
					while (proceed == 'y') {
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
							
							/*
							AccountsPojo newViewBalancePojo = new AccountsPojo();
							AccountsPojo ViewBalancePojo = null;
							try {
								accountsService.viewBalance(newViewBalancePojo);
								System.out.println("Your balance is: " + newViewBalancePojo.getBalance());
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							*/
							break;
						case 2:
							AccountsPojo newBalance = new AccountsPojo();
							
							System.out.println("Please enter how much you want to deposit:");
							double deposit=scan.nextDouble();
							AccountsPojo depositPojo = null;

							try {
								
								depositPojo = accountsService.updateBalance(newBalance, deposit);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}

							System.out
									.println("You deposit $" + newBalance.getBalance() + " to your bank account.");
							break;
						case 3:
							/*
							AccountsPojo newWithdrawPojo = new AccountsPojo();
							System.out.println("Please enter how much you want to withdraw:");
							newWithdrawPojo.setWithdraw(scan.nextDouble());
							AccountsPojo withdrawPojo = null;

							try {
								depositPojo = accountsService.addDeposit(newWithdrawPojo);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}

							System.out.println(
									"You withdraw $" + newWithdrawPojo.getWithdraw() + " from your bank account.");
									*/
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
