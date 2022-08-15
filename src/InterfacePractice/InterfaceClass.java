package InterfacePractice;

public class InterfaceClass implements InterfaceUses,InterfaceUses2 {

	public static void main(String[] args) {
		
  InterfaceClass Ic=new InterfaceClass();
  Ic.nature();
  Ic.look();
  Ic.money();
  Ic.nature();
  Ic.love();
 
	}

	@Override
	public void attitude() {
	
	System.out.println("hi attitude");	
	}

	@Override
	public void money() {
		System.out.println("hi money");
		
	}

	@Override
	public void nature() {
		System.out.println("hi nature");
		
	}

	@Override
	public void look() {
		System.out.println("hi look");
		
	}

	@Override
	public void love() {
		InterfaceUses.super.love();
		InterfaceUses2.super.love();
		
	}
	

}
