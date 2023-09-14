package aplication;

import java.util.Locale;
import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;

public class AplicationArchitecture {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number:");
		Integer number = scan.nextInt(); 
		System.out.println("Holder:");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Initial deposit :");
		Double balance = scan.nextDouble();
		System.out.print("withdraw Limit :");
		Double withdraw = scan.nextDouble();

		Account account = new Account(number,holder,balance,withdraw); 

		System.out.print("enter account withdraw:");
		Double amount = scan.nextDouble();

		try {
			account.withdraw(amount); 
			System.out.println( String.format("%.2f", account.getBalance()));
			scan.close();
		}catch(BusinessException e) {
			System.out.println("error" + e.getMessage());
		}

	}

}
