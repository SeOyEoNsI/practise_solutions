package week04;
import java.util.*;

public class DivideByZero {
   public static void main(String[] args) {
      int number1, number2, result;

		try{
      Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		number1 = sc.nextInt();
		  
		System.out.print("�ι�° ����: ");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
		sc.close();
		}
		
	    catch (ArithmeticException e) {
			System.out.println("Error!!!");
		}
	    catch (InputMismatchException e) {
			System.out.println("Wrong number !!!");
		}
	    finally{
			System.out.println("Next Program");
	    	
	    }
   }
}
