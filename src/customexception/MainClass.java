package customexception;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the marks");
		int marks =sc.nextInt();

		if(marks>60) {
			System.out.println("apply for amazon interview");

		}
		else {
			try {
				throw new InvalidMarksException("not eligible");
			}
			catch(InvalidMarksException e){
				System.out.println(e.getMessage());

			}
		}
	}

}
