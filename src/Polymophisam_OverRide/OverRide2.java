package Polymophisam_OverRide;

public class OverRide2 extends OverRide {

	public static void main(String[] args) {
	OverRide2 mo=new OverRide2();
	mo.sub(10, 20);
	mo.Sub();
	

	}


public void sub(int x,int y)
{
	 
	 int sum = x+y;
	System.out.println("The value comination "+sum);

}

}
