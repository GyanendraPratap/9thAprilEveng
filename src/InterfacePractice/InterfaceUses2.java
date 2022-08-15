package InterfacePractice;

public interface InterfaceUses2 {

	void attitude();
	void money();
	
	default void love()
	{
		System.out.println("hi Interface part two");
	}
	static void test()
	{
		System.out.println(" test two");
	}
}
