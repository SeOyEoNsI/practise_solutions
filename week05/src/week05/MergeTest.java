package week05;
import java.io.*;
import java.util.*;

public class MergeTest{
	public static void main(String[] args) {
		try {
			FileReader fr1 = new FileReader("output.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader("output1.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			FileWriter fr3 = new FileWriter("output2.txt");
			BufferedWriter br3 = new BufferedWriter(fr3);
			while (true) {
				String line = br1.readLine();
				if (line == null)
					break;
				br3.write(line);
				br3.newLine();
			}
			while (true) {
				String line = br2.readLine();
				if (line == null)
					break;
				br3.write(line);
				br3.newLine();
			}
			br3.flush();
			fr1.close();
			fr2.close();
			fr3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
