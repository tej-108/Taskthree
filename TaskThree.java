

import java.util.Scanner;

class UserAccount {
	protected double accountBalance;
}

class ATM extends UserAccount {
	
	protected void withdraw(double amount) {
		if(amount > accountBalance) {
			System.out.println("\nInsufficient balance, transaction failed!\n");
		}
		else {
			accountBalance = accountBalance - amount;
			System.out.println("\n" + amount + " INR has been withdrawn from the account, transaction succeed!\n");
		}
	}
	
	protected void deposit(double amount) {
		accountBalance = accountBalance + amount;
		System.out.println("\n" + amount + " INR has been deposited to the account, transaction succeed!\n");
	}
	
	protected double checkBalance() {
		return accountBalance;
	}
	
}

public class TaskThree extends ATM {
	
	public static void main(String[] args) {
		
		TaskThree t3 = new TaskThree();
		try (Scanner scanner = new Scanner(System.in)) {
			double amount = 0.0;
			double balance = 0.0;
			int choice = 0;
			
			do {
				System.out.print("1.Deposit\n2.Withdraw\n3.Check balance\n4.Exit\n\n");
				System.out.print("Select an option : ");
				choice = scanner.nextInt();
				
				switch(choice) {
				case 1: 
					System.out.print("\nEnter amount : ");
					amount = scanner.nextDouble();
					t3.deposit(amount);
					break;
					
				case 2:
					System.out.print("\nEnter amount : ");
					amount = scanner.nextDouble();
					t3.withdraw(amount);
					break;
				case 3:
					balance = t3.checkBalance();
					System.out.printf("\nCurrent balance : %.2f INR\n\n", balance);
					break;
					
				case 4:
					System.out.println("\nThank you!");
					break;
					
				default:
					System.out.println("\nInvalid selection, make sure you select correct option.\n");
					break;
				}
				
			}while(choice != 4);
		}
	}


	}

