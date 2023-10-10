package application;

import java.security.DomainLoadStoreParameter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initital balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			
			acc.withdraw(withdraw);		
			System.out.println(acc);
		}
		catch(DomainException e) {
			System.out.println("Mensage error: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
	}
}
