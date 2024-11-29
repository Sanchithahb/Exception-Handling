package day1;

public class Runner {
	public static void main(String[] args) {
		System.out.println("start");
		int[] a = {1,2,3,4};
		try {
		System.out.println(a[1]);//if we give 100 -->java.lang.ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index position");
		}
		System.out.println("end");
	}

}
