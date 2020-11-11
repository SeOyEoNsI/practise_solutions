package week06;
import java.util.*;
public class Game1 {
	public static void main(String[] args){
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.println("하나를 선택하시요 : 가위(0), 바위(1), 보(2) :");
		num1 = s.nextInt();
		num2 = r.nextInt(3);
		if(num2 == 0)
			System.out.println("컴퓨터는 가위를 냈습니다.");
		else if(num2 == 1)
			System.out.println("컴퓨터는 바위를 냈습니다.");
		else
			System.out.println("컴퓨터는 보를 냈습니다.");

		if(num1==0){
			if(num2 == 1)
				System.out.println("컴퓨터가 이겼습니다");
			else if(num2 == 2)
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		else if(num1 == 1){
			if(num2 == 0)
				System.out.println("당신이 이겼습니다.");
			else if(num2 == 2)
				System.out.println("컴퓨터가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		else{
			if(num2 == 0)
				System.out.println("컴퓨터가 이겼습니다");
			else if(num2 == 1)
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
	}

}
