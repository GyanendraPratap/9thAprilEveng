package constructor;

public class MathOperator {
	
	int c;
	int d;
	
	public MathOperator()
	{
	System.out.println("Runing user defined constructor");	
		c=30;
		d=40;
	
	}

	public static void main(String[] args) {
		
    MathOperator m=new MathOperator();
      m.add();
	}

	public void add() {
		
	int sum=c+d;
	System.out.println("sum is "+sum);
}
}