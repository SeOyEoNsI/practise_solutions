package week04;
import java.util.Scanner;

public class ExceptionTest2 {
   public static void main(String[] args) {
      int[] list;
      int sum = 0, count;

    try {
		Scanner sc = new Scanner(System.in);
		  System.out.print("정수의 개수: ");
		  count = sc.nextInt();
		  list = new int[count];

		  for(int i=0; i<count; i++){
			  System.out.print("정수를 입력하시오: ");
			  list[i] = sc.nextInt();
		  }
		  for(int i=0;i<count; i++){
			  sum += list[i];
		  }
		  System.out.println("평균은 "+ sum/count);
		  sc.close();
	} 
    catch (ArithmeticException e) {
		System.err.println("산술 오류");
	}
	catch (NegativeArraySizeException e) {
		System.err.println("배열 인덱스가 음수 오류");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("배열 인덱스가 범위를 넘는 오류");
	}
	catch (NullPointerException e) {
		System.err.println("Null Point 오류");
	}
   }
}
