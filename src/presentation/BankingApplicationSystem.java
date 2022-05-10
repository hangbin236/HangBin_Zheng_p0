package presentation;

import java.util.Scanner;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char proceed = 'y';
		
		while(proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("BANKING APPLICATION SYSTEM");
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
		}
	}

}
