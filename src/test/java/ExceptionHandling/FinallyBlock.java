package ExceptionHandling;

//We need to remember the sequence
//Finally block will override the values .Not good practice to write return inside finally block
public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println(div(10, 0));

	}

	public static int div(int a, int b) {
		int d = 0;

		try {
			d = a / b;
			System.out.println("Hi");
			System.out.println("Hello");
			return d;
		} catch (Exception e) {
			System.out.println("oame exception is cmg ");
			return d;
		} finally {
			System.out.println("Iam inside finally block");
		//	return -1;
		}

	}

}
