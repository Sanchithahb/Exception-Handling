package day1;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("START");
		System.out.println("enter the first number");
		int s1 = sc.nextInt();//10
		System.out.println("enter the second number");
		int s2 = sc.nextInt();//0 -->java.lang.ArithmeticException:


		sc.close();

		try {
			System.out.println(s1/s2); //problem line
		}
		catch(ArithmeticException e) {
			System.out.println("do not divided by 0"); //solution line
		}
		System.out.println("END");

	}

}
