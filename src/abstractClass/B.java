package abstractClass;

public class B extends A  {

	public static void main(String[]args) {
		B b=new B();
		b.demo1();
		b.demo2();
		b.demo3();
		b.demo4();
		b.demo5();
	}

	@Override
	
	public void demo3() {
		System.out.println("gyanendra");
		
	}

	@Override
	public void demo4() {
		
		System.out.println("gyanendra1 ");
	}

	@Override
	public void demo5() {
		
		System.out.println("gyanendra2");
	}
}
