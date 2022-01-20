package abstractVSinterface;

interface myInterface {
	void methodA();
	void methodB();
	void methodC();	
}

abstract class myAbstractClass implements myInterface {
	public void methodA() {
		System.out.println("methodA from myAbstractClass has been called.");
	}
}

class mySubClass extends myAbstractClass {
	@Override
	public void methodB() {
		System.out.println("methodB from mySubClass has been called.");
	}
	@Override
	public void methodC() {
		System.out.println("methodC from mySubClass has been called.");
	}
}

public class AbstractVSInterface {
	public static void main(String[] args) {
		mySubClass myInstanceClass = new mySubClass();
		myInstanceClass.methodA();
		myInstanceClass.methodB();
		myInstanceClass.methodC();
	}
}
