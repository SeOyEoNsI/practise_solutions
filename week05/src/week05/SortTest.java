package week05;
import java.io.*;
import java.util.*;

public class SortTest{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			int[] list = new int[100];
			int cnt=0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				int value = Integer.parseInt(line);
				list[cnt++]=value;
			}
			fr.close();
			int[] value = new int[cnt];
			System.arraycopy(list, 0, value, 0, cnt);
			Arrays.sort(value);
			
			FileWriter fr1 = new FileWriter("output.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);
			for (int k = 0; k < value.length; k++) {
				String bb = Integer.toString(value[k]);
				br1.write((k+1) +" : " +bb);
				br1.newLine();
			}
			br1.flush();
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
