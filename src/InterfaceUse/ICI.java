package InterfaceUse;

public class ICI implements  B {

	public static void main(String[] args) {
	ICI ic=new ICI();
	ic.test1();
	ic.test2();
	ic.test3();
	ic.test4();

	}

	@Override
	public void test1() {
		
		System.out.println("hi test first");
	}

	@Override
	public void test2() {
		System.out.println("hi test second");
		
	}

	@Override
	public void test3() {

		System.out.println("hi test third");
	}

	@Override
	public void test4() {
		
		System.out.println(" hi test four");
	}

}