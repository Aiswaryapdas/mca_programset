import Graphics.Area;

public class test_package {
	
	public static void main(String args[]) {
		Area A = new Area();

		System.out.println("**COMPUTATION OF AREA OF DIFFERENT FIHURES**");
		System.out.println("\n__RECTANGLE__");
		A.rectangle();

		System.out.println("\n__TRIANGLE__");
		A.triangle();

		System.out.println("\n__SQUARE__");
		A.square();

		System.out.println("\n__CIRCLE__");
		A.circle();
	}
}