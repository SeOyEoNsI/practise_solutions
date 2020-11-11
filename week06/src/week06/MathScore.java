package week06;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(MathScore e) {
		if (this.score > e.score)
			return 1;
		else if (this.score == e.score)
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		return name + ", " + score;
	}
}
