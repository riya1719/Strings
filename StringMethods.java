/*
 * Program to demonstrate the usage of different String Methods in java
 */

package Package2;

public class StringMethods {
	
	
	public static void main(String[] args) 
	{
	
		String s1 = "ROYAL";
		String s2 = "ROYAL";
		String s3 = "royal";
		
		String s5 = "SACHIN";
		String s6 = "SAURAB";
		
		
		// comparing both upper case strings
		System.out.println(s1 + " equals to " +s2+ " :"+ s1.equals(s2));
		
		// comparing one upper case and lower case string
		System.out.println(s1 + " equals to " +s3+ " :"+ s2.equals(s3));
		
		// comparing one upper case and lower case string
		System.out.println(s2 + " equals to " +s3+ " Ignoring cases :"+ s2.equalsIgnoreCase(s3) + '\n'); 
		
		// comparing both upper case strings
		System.out.println(s1 + " compare to " +s2+ " :"+ s1.compareTo(s2));
		// comparing one upper case and lower case string
		System.out.println(s2 + " compare to " +s3+ " :" + s2.compareTo(s3)); 
		// comparing one upper case and lower case string
		System.out.println(s3 + " compare to " +s2+ " :" + s3.compareTo(s2));
		
	
		System.out.println(s2 + " compare to " +s3+ " Ignoring cases :"+ s2.compareToIgnoreCase(s3)); 
		System.out.println(s5 + " compare to " +s6+ " Ignoring cases :"+ s5.compareToIgnoreCase(s6));
		System.out.println(s6 + " compare to " +s5+ " Ignoring cases :"+s6.compareToIgnoreCase(s5)+ '\n');
		
		System.out.println("Check if "+ s2+ " starts with R: " + s2.startsWith("R"));
		System.out.println("Check if "+ s2+ " starts with r: " +s2.startsWith("r")); 
		System.out.println("Check if "+ s2+ " starts with R from index 1: " +s2.startsWith("R",1));
		System.out.println("Check if "+ s2+ " starts with R from index 0: " +s2.startsWith("Ro",0));
		System.out.println("Check if "+ s2+ " starts with R from index 1: " +s2.startsWith("O",1) + '\n');

		
		System.out.println("Check if "+ s2+ " ends with L: "+ s2.endsWith("L"));
		System.out.println("Check if "+ s2+ " ends with AL: "+s2.endsWith("AL"));
		System.out.println("Check if "+ s2+ " ends with O: "+s2.endsWith("O") + '\n'); 
		
		//System.out.println("Check if "+ s2+ " ends with O: "+s2.endsWith("O" , 2)); 
		
		//valueOf() method converts different types of values into string.
		
	
		String string1 = String.valueOf(45); //integer
		String string10 = String.valueOf(45); //integer

		System.out.println(string1 == string10);
		
		String string2 = String.valueOf(45.55f); //float 
		String string3 = String.valueOf(45l); //long 
		String string4 = String.valueOf(45.55); //double 
		String string5 = String.valueOf('Z');  
		String string6 = String.valueOf("UMER");  
		String string7 = String.valueOf(true); 
		
        char chr[]={'H','I','M','J','A'};  
		String string8 = String.valueOf(chr); 
		
		
		StringMethods obj = new StringMethods();
		String string9 = String.valueOf(obj); 
		
		
        System.out.println(string1);  
        System.out.println(string2);  
        System.out.println(string3);  
        System.out.println(string4);  
        System.out.println(string5);  
        System.out.println(string6);  
        System.out.println(string7);  
        System.out.println(string8);  
        System.out.println(string9);  
        
        Integer obj2 = Integer.valueOf(23);
        Integer obj3 = Integer.valueOf(23);
        Integer obj4= obj2;
        System.out.println(obj2);
        System.out.println(obj3);
        
        Integer obj5 = new Integer (23);
        System.out.println(obj5.equals(obj3));

        
        
        

        System.out.println(obj2.equals(obj3));
        

        
        
        
        





		
		 


		




		






		
		
		
	
		
		
		
		
		


		
		

		

		
		
		
		
		
		
	

	
	
}
}
