import Arithmetic.Operations;

public class test_operations {

	public static void main(String args[]){
		Operations O = new Operations();

		System.out.println("**Arithmetic operations**");
		System.out.println("\n__Addition__");
		O.Addition();
		
		System.out.println("\n__Substraction__");
		O.Substraction();

		System.out.println("\n__Multiplication__");
		O.Multiplication();

		System.out.println("\n__Division__");
		O.Division();
	}
}