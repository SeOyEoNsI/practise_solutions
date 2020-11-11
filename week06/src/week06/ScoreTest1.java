package week06;

public class ScoreTest1 {
	static <T extends Comparable> T findBest(T[] a) {
		T best = a[0];

		for (int i = 0; i < a.length; i++)
			if (best.compareTo(a[i]) < 0)
				best = a[i];
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김유신", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김유신", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));
	}
}
