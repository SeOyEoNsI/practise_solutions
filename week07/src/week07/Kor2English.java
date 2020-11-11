package week07;
import java.io.*;
import java.util.*;

public class Kor2English {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("dic.dat");
		BufferedReader br = new BufferedReader(fr);
		
		Map<String, String> dic = new HashMap<String, String> ();
		String str, eng, kor;
		
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			eng = st.nextToken();
			kor = st.nextToken();	
			dic.put(kor,eng);
		}
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�ѱ� ? ");
			String key = sc.next();
			if(key.equals("�׸�")) {
				System.out.println("����!");
				break;
			}
			if(dic.get(key) != null)
				System.out.println("english : "+ dic.get(key));
			else 
				System.out.println("���� �ܾ�!");
						
		}while(true);
		br.close();
		sc.close();
	}

}
