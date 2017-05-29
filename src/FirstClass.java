
public class FirstClass {
	public String first;
	public String last;
	public static int members;

	public FirstClass(String string, String string2) {
		// TODO Auto-generated constructor stub
		first = string;
		last = string2;
		members++;
	}

	public static <T> void add(T a, T b) {
		System.out.println(a + " + " + b);
	}

	public static void main(String[] args) {
		FirstClass obj1 = new FirstClass("sree", "lata");
		System.out.println(obj1.first + " " + obj1.last + " " + members);
		add(obj1.first, obj1.last);
		add(1, 2);

	}
}
