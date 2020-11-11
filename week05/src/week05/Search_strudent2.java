package week05;
import java.io.*;
import java.util.*;

public class Search_strudent2{
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));		
		Object oo=null;
		String[] str = new String[100];
		String o_grade = "1";
		int cnt=0,lcnt=0;;
		try {
			while ((oo= ois.readObject())!= null) {
				Student stu= (Student)oo;
				str[cnt++] = stu.grade + " "+stu.num + " "+stu.name + " "+stu.tel_number;
	//			System.out.println(str[cnt-1]);
			}

			ois.close();


		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//  System.err.println(e);
			System.out.println(o_grade+"ÇÐ³â");
		}
		
		String[] str_a = new String[cnt];

		System.arraycopy(str, 0, str_a,0,cnt);
		Arrays.parallelSort(str_a);
	
		for(int i =0; i<cnt;i++) {
			StringTokenizer st = new StringTokenizer(str_a[i], " ");
			while(st.hasMoreTokens()) {
				String grade = st.nextToken();
				String num = st.nextToken();
				String name = st.nextToken();
				String tel_number = st.nextToken();
				if(o_grade.equals(grade)) {
					System.out.println(num + "\t " +grade + "\t " + name + "\t "+ tel_number);
					lcnt++;
				}
				else {
					System.out.println("ÃÑ "+ lcnt + " ¸í");
					System.out.println("\n"+grade+"ÇÐ³â");
					System.out.println(num + "\t " +grade + "\t " + name + "\t "+ tel_number);
					lcnt=1;
				}
				o_grade = grade;
			}

		}
		System.out.println("ÃÑ "+ lcnt + " ¸í");
	}
}
