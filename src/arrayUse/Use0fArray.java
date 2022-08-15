package arrayUse;

public class Use0fArray {

	public static void main(String[] args) 
	{
		
		String Name[]=new String[9];
		
		
		Name [0]="Gyanendra";
		Name [1]="smruti";
		Name [2]="Darshana";
		Name [3]="Smita";
		Name [4]="Ritesh";
		Name [5]="Mahesh";
		Name [6]="Santosh";
		Name [7]="Sunita";
		
		System.out.println(Name[0]);
		System.out.println(Name[1]);
		System.out.println(Name[2]);
		System.out.println(Name[3]);
		
		System.out.println("===============");
		//static coding
		for(int i=0;i<=3;i++)
		
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("===============");
		
		for (int i=3;i>=0;i--)
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("=================");
		
		System.out.println(Name.length);
		
		System.out.println("==================");
		for (int i=0;i<=Name.length-1;i++)
				
				
			System.out.println(Name[i]);
			
	    System.out.println("==================");
	    
	    System.out.println(Name.length);
	    for (int i=Name.length-1;i>=0;i--)
	    
	    {
	    	System.out.println(Name[i]);
	    }
	    
				}
	{	
	}

}
