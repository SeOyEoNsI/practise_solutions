package week04;
import java.util.*;

public class DivideByZero1 {
	public static void main(String[] args) {
		int number1, number2, result;

		try{
			Scanner sc = new Scanner(System.in);

			System.out.print("첫번째 정수: ");
			number1 = sc.nextInt();

			System.out.print("두번째 정수: ");
			number2 = sc.nextInt();

			result = quotient(number1, number2);
			System.out.println(result);
			sc.close();
		}

		catch (Div e) {
			System.err.println(e.getMessage());
			System.out.println("Error!!!");
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong number !!!");
		}
		finally{
			System.out.println("Next Program");

		}
	}
	public static int quotient(int i, int j) throws Div {
		if(j==0)
			throw new Div();
		return i/j;
	}
}

class Div extends Exception {
	private static final long serialVersionUID = 1L;

	public Div() {
		super("사용자 정의");
	}
}
