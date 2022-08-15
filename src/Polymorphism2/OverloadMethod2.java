package Polymorphism2;

public class OverloadMethod2 {
	
	public static void main(String[]orgs) {
		
		OverloadMethod2 o=new OverloadMethod2();
		o.add();
		o.add(10);
		o.add(30, 90);
		
	}
 public void add()
 {
	 int a=10;
	 int b=20;
	 int sum=a+b;
	 System.out.println("my sum is" +sum);
 }
 
 public void add(int a)
 {
	a=30;
	int sum= a+10;
	System.out.println("sum is "+sum);
	 
 }
 public void add(int a,int b)
 {
	 int sum =a+b;
	 System.out.println("sum is " + sum);
 }
}
