package gyanendra;

public class StaticMethod {

	public static void main(String[] args) {
		 Method2.styl();
		test();
		StaticMethod sm=new StaticMethod();
		sm.city();
		Method2 m=new Method2();
		m.city2();
		sm.add("Ankit", 30);
		

	}
	public static void test()
	{
		System.out.println("hi i m gyanendra from same class");
	}
		 
	 
	public void city() {
		
		System.out.println(" hi im non static method");
		
			}
	public void add(String name,int a)
	{
		System.out.println("my name is "+name);
		System.out.println("my a is"+a);
	}
	
		

}
