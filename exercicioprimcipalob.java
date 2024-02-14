package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)");
	char response = sc.next().charAt(0);
	if(response == 'y') {
		System.out.println("Enter initial deposit value");
		double initialDeposit = sc.nextDouble();
		acc = new Account(number, holder, initialDeposit);
	}
	else {
		acc = new Account(number, holder);
	}
		System.out.println();
		System.out.println("Account data");
		System.out.println(acc);
		
		System.out.println();
		System.out.println("Enter a deposit value");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println(acc);
		
		System.out.println();
		System.out.println("Enter a deposit withdraw value");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Update account data:");	
		System.out.println(acc);
		
		
		
		
		sc.close();
	}

}
