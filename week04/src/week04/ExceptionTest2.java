package week04;
import java.util.Scanner;

public class ExceptionTest2 {
   public static void main(String[] args) {
      int[] list;
      int sum = 0, count;

    try {
		Scanner sc = new Scanner(System.in);
		  System.out.print("������ ����: ");
		  count = sc.nextInt();
		  list = new int[count];

		  for(int i=0; i<count; i++){
			  System.out.print("������ �Է��Ͻÿ�: ");
			  list[i] = sc.nextInt();
		  }
		  for(int i=0;i<count; i++){
			  sum += list[i];
		  }
		  System.out.println("����� "+ sum/count);
		  sc.close();
	} 
    catch (ArithmeticException e) {
		System.err.println("��� ����");
	}
	catch (NegativeArraySizeException e) {
		System.err.println("�迭 �ε����� ���� ����");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("�迭 �ε����� ������ �Ѵ� ����");
	}
	catch (NullPointerException e) {
		System.err.println("Null Point ����");
	}
   }
}
