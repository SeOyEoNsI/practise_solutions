package week06;

class Box<T> {
	T b;

	T get() {
		return b;
	}

	void set(T b) {
		this.b = b;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(100);
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("Hello!");
		System.out.println(s.get());
	}
}
