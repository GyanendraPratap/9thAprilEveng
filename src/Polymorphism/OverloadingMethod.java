package Polymorphism;

public class OverloadingMethod {

	public static void main(String[] args) {
		OverloadingMethod o=new OverloadingMethod();
         o.Student_info();
         o.Student_info("Gyanendra", 70.67f);
         o.Student_info("Ritesh",78.8f);
         
	}
public void Student_info()
{
 System.out.println("zero parameter");
 String name="Gyanendra";
 float weight= 70.67f;
 
 System.out.println("my name is "+ name);
 System.out.println("my weight is "+ weight);
 System.out.println("=====================");
}

public void Student_info( String Name,float weight)
{
	Name="Ritesh singh";
	weight= 78.8f;
	System.out.println("with two parameter");
	System.out.println("my Name is "+ Name);
	System.out.println("my weight is "+ weight );
	System.out.println("==========================");
	}
}
