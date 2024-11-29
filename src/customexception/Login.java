package customexception;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		int password = sc.nextInt();
		sc.close();

		if(password == 111) {
			System.out.println("valid password,login successful");
		}
		else {
			try {
				throw new InvalidPasswordException("invalid");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
