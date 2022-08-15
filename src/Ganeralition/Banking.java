package Ganeralition;

public class Banking {

	public static void main(String[] args) {
	SBI s=new SBI();
	BOI b=new BOI();
     Axis a=new Axis();
     s.deposite();
     s.loan();
     s.transfer();
     s.SBIapp();
     
     System.out.println("==================");
     
     a.deposite();
     a.loan();
     a.transfer();
     a.AxisApps();
     
     System.out.println("----------------");
     
     b.deposite();
     b.loan();
     b.transfer();
     b.BOIstar();
     

	}

}
