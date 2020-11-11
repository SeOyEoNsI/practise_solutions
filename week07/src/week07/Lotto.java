package week07;

import java.util.*;

public class Lotto {
	@Override
	public String toString() {
		return "Lotto ¹øÈ£ =" + set;
	}

	TreeSet<Integer> set = new TreeSet<Integer>();

	public Lotto() {
		int d;
		for (int i = 0; i < 6; i++) {
			do {
				d = (int) ((Math.random() * 45.0) + 1.0);
			} while (set.contains(d));
			set.add(d);
		}
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println(lotto);
		
	}
}