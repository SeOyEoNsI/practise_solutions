package week07;

import java.util.*;
public class EnglisDic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Map<String, String> st = new HashMap<String, String> ();

		st.put("map", "����");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("����ܾ� ? ");
			String key = sc.next();
			if(key.equals("quit")) {
				System.out.println("done!");
				break;
			}
			if(st.get(key) != null)
				System.out.println("�ѱ� : "+ st.get(key));
			else 
				System.out.println("Not exist!");
						
		}while(true);
		sc.close();
	}

}
