import java.util.Scanner;

public class driver {
	public static void main (String args[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		multiplication obj1 = new multiplication();
		obj1.start();
		prime obj2 = new prime(num);
		obj2.start();
	}
} 