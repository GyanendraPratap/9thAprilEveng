package Casting2;

public class UpCasting2 {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son ();
		f.ram();
		f.rom();
		System.out.println("=========");
		
		s.ram();
		s.rom();
		s.processor();
		System.out.println("========");
		
		Father f1=new Son();
		f1.ram();
		f1.rom();
		// f1.processor

	}

}

