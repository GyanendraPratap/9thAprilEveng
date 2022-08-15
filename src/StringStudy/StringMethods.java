package StringStudy;

public class StringMethods {

	public static void main(String[] args) {
		String s="Hi";
		 String s1=new String("Hello");
		 
		 // Use lenght Method
         
		 System.out.println(s1.length());
		 
		  int Mylenght=s1.length();
		  System.out.println(Mylenght);
		  
		  String s2="";
		  System.out.println();
		  
		//  String s3=null;
		//  System.out.println(s3.length());
		  
		// use topupperCase method
		  
		  String a="Gyanendra";
		  System.out.println(a);
		  System.out.println(a.toUpperCase());
		  
		  String b=a.toUpperCase();
		  System.out.println(b);
		  
		  // Use lowerCase()Method
		  
		  System.out.println(b.toLowerCase());
		  
		  //use of equal()Method
		  System.out.println("--------------");
		  
		  String c1=new String("butan");
		  String c2=new String ("Butan");
		  
		  System.out.println(c1.equals(c2));
		  String v0="Gyanendra";
		  String v1="Gyanendra";
		  String v2="Gyanendra";
		  String v3="Gyanendra";
		  String v4="gyanendra";
		  
		  System.out.println(v0==v1);
		  System.out.println(v1==v2);
		  System.out.println(v2==v3);
		  System.out.println("===================");
		  
		  System.out.println(v0.equals(v1));
		  System.out.println(v1.equals(v2));
		  System.out.println(v2.equals(v3));
		  System.out.println(v3.equals(v4));
		  
		  System.out.println(v3.equalsIgnoreCase(v4));
		  System.out.println(c1.equalsIgnoreCase(c2));
		  
		  
		  
	}

}
