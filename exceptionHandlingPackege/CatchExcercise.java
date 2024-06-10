package exceptionHandlingPackege;

public class CatchExcercise {

	public static void main(String args[]) {
		
		try {
			int arr[] = {1,2,3,5};
			arr[5] = 30/5;
		}
		catch(ArithmeticException  ae) {
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ari) {
			System.out.println(ari.getMessage());
		}
		finally {
			System.out.println("Program Ended...");
		}
	}
	
}
