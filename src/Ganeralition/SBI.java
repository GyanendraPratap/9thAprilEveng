package Ganeralition;

public class SBI implements RBI {

	@Override
	public void deposite() {
		System.out.println("SBI deposite interest 5.5%");
		
	}

	@Override
	public void loan() {
		System.out.println("SBI loan interest 7.7%");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI tranfer CDM,RGTS,IMPS");
		
	}
 public void SBIapp()
 {
	 System.out.println("SBI own apps");
	 }
 }
