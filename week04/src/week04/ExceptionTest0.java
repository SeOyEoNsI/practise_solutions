package week04;
import java.util.*;

public class ExceptionTest0 {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      int sum = 0, count;

    try {
		Scanner sc = new Scanner(System.in);
		  System.out.print("������ ����: ");
		  count = sc.nextInt();

		  for(int i=0; i<count; i++){
			  int score;
			  System.out.print("������ �Է��Ͻÿ�: ");
			  score = sc.nextInt();
			  if(score <0) throw new NegativeNumberException();
			  sum+=score;
		  }
		  System.out.println("����� "+ sum/count);
		  sc.close();
	} 
    catch (ArithmeticException e) {
		System.out.println(e+" ��� ����");
	}
	catch (NegativeNumberException e) {
		System.err.println(e+" ���� �Է� ����");
	}
   }
}

class NegativeNumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public NegativeNumberException() {
		super();
	}
}
