package customexception;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance=2000;
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		if(amount<balance) {
			System.out.println("withdrawn successfully.");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
