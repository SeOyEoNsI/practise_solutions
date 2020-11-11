package week05;
import java.io.*;

public class Search_strudent{
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));		
		Object oo=null;
		int cnt = 0;
		try {
			while ((oo= ois.readObject())!= null) {
				Student stu= (Student)oo;
				if(stu.grade ==2) {
					System.out.println(stu.num + "\t " + stu.grade + "\t " + stu.name + "\t "+ stu.tel_number);
					cnt++;
				}
			}
			ois.close();
		} catch (EOFException e) {
			System.out.println(" ");
			 System.out.println("รั : " + cnt +" ธํ");
			// TODO Auto-generated catch block
			// System.err.println(e);
		}
	}
}
