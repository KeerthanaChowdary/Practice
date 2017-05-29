
public class SubClass extends SuperClass {
	int speed = 10;

	void getSpeed() {
		speed = 30;
		super.getSpeed();
	}

	public static void main(String[] args) {
		SubClass subobj = new SubClass();
		subobj.getSpeed();
		System.out.println("subclass var: " + subobj.speed);
		SuperClass obj = new SubClass();
		obj.getSpeed();
		System.out.println("run time poly superclass ref, subclass obj: " + obj.speed);
	}
}
