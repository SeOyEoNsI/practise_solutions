package week06;
import java.util.*;
public class Game1 {
	public static void main(String[] args){
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.println("�ϳ��� �����Ͻÿ� : ����(0), ����(1), ��(2) :");
		num1 = s.nextInt();
		num2 = r.nextInt(3);
		if(num2 == 0)
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		else if(num2 == 1)
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		else
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");

		if(num1==0){
			if(num2 == 1)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			else if(num2 == 2)
				System.out.println("����� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
		else if(num1 == 1){
			if(num2 == 0)
				System.out.println("����� �̰���ϴ�.");
			else if(num2 == 2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
		else{
			if(num2 == 0)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			else if(num2 == 1)
				System.out.println("����� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
	}

}
