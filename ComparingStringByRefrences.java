/*
 * Program to Compare String By their refrences
 */

package Package2;

public class ComparingStringByRefrences
{
	public static void main(String[] args) 
	{
//		String s1 = "JAVA"; // constant
//		String s2 = s1.intern();
//		
//		System.out.println((s1 == s2)); 

		
		String s1 = new String("JAVA");
		// non constant
		String s2 = s1.intern();
		//constatnt
		
		// System.out.println((s1 == s2)); 

    	String s3 = new String("JAVA");
//		// non constant
	
    	String s4 = s1.intern(); 
    	String s5 = s2.intern(); 
    	String s6 = s3.intern(); 

    	
  
     	System.out.println((s2 == s4)); 
		System.out.println((s2 == s5)); 
		System.out.println((s2 == s6)); 
		
//		
		System.out.println((s2 == s1)); 
		System.out.println((s2 == s3)); 
		
		System.out.println((s3 == s1)); 





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String string1=new String("JAVA");
//		String string2 = string1.intern();
//		System.out.println((string1 == string2)); 
//
//
//		String string3=new String("JAVA");
//		System.out.println((string1 == string3)); 
//		System.out.println( (string2 == string3)); 
//
//		String string4 = string1.intern();
//		String string5 = string2.intern();
//		String string6 = string3.intern();
//
//		System.out.println((string4 == string2));
//		System.out.println((string5 == string2)); 
//		System.out.println((string6 == string2));






	/*String s1 = "JAVA"; 
	String s2 = "JAVA";
	
	String s3 = new String ("JAVA");
	String s4 = new String ("JAVA");
	
	
	if (s1 == s2)
	System.out.println("Refrences of " + s1 + " and " + s2 +"  are equal");
	
	else 
	System.out.println("Refrences of " + s1 + " and " + s2 +"  are not equal");
	
	
	if (s3 == s4)
	System.out.println("Refrences of " + s3 + " and " + s4 +"  are equal");
	
	else 
	System.out.println("Refrences of " + s3 + " and " + s4 +"  are not equal" + '\n');
	
	
	String string1 = "HARSHAL".intern();
	
	String string2 = "HARSHAL".intern(); //returns string from pool 
	String string3 = new String ("HARSHAL");
	String string4 = string3.intern(); //returns string from pool 
	String string5 = new String ("HARSHAL");
	
	//System.out.println(string7 == string1);

	System.out.println(string1 == string2);
    System.out.println(string1 == string3);
	System.out.println(string1 == string4);
	System.out.println(string2 == string3);
	System.out.println(string2 == string4);
	System.out.println(string3 == string4);
	System.out.println(string3 == string5);
	System.out.println(string1 == string5);



	
	 
	 System.out.println();
	// EXCEPTION CASE: 
	
	String s5 = "JAVA"; 
	String s6 = "PYTHON";
	
	String s7 = "JAVA" + "PYTHON" ; 
	String s8 = "JAVA" + "PYTHON" ;
	
	
	String s9 = s5 + s7; 
	String s10 = s5 + s7;
	
	//System.out.println( "s7: " + s7 + ", s8:" + s8 + ","+ " s9:" + s9 + ", s10:" +s10 + '\n');

	
	if (s7 == s8)
	System.out.println("Refrences of " + s7 + " and " + s8 +"  are equal");
	
	else 
	System.out.println("Refrences of " + s7 + " and " + s8 +"  are not equal");
	
	
	if (s9 == s10)
	System.out.println("Refrences of " + s9 + " and " + s10 +"  are equal");
	
	else 
	System.out.println("Refrences of " + s9 + " and " + s10 +"  are not equal");

	*/
	
	}
}
