package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acct;
		
		System.out.print("Enter account number");
		int number = sc.nextInt();
		System.out.print("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();		
		
		System.out.println("Is there na initial deposit (y/n)?");
	    char answer = sc.next().charAt(0);
	    
		if (answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acct = new Account (number , holder , initialDeposit);			
			
		}
		else {
			acct = new Account (number , holder);			
					
		}		
		System.out.println();	
		
		System.out.println("Account data : ");
		System.out.println(acct);
				
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		acct.depositValue(depositValue);			
		System.out.println("Updated account data: ");	
		System.out.println(acct);
		
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		acct.whitdrawValue(withdrawValue);			
		System.out.println("Updated account data: ");
		System.out.println(acct);
		
		
		
		
		
     sc.close();
	}

}
