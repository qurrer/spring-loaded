package invokespecial;

public class A {

	public int getInt() {
		return 65;
	}

	public String toString(boolean b, String s) {
		return new StringBuilder("65").append(b).append(s).toString();
	}
}
