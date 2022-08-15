package InterfacePractice;

public interface InterfaceUses {

	void nature();
	void look();
	
	default void love()
	{
	System.out.println("hello part one");	
	}
	
	static void test()
	{
		System.out.println("test");
	}
	
}
