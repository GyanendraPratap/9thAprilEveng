package gyanendra;

public class Myclass {
	int a;
	int b;
	
	public Myclass()//defult constructor
	{
		int a=20;
		int b=30;
	int sum=a+b;
	System.out.println("sum is "+sum);
	
	}
	public Myclass(int a,int b)//withparameter constructor
	{
		
		int sum=a+b;
		System.out.println("my sum "+sum);
	}
	

	public static void main(String[] args) {
		
        Myclass mc=new Myclass();
        Myclass ab=new Myclass(10,20);

	}
	
	
	}


