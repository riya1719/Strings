package Package2;

public class StringMethods3 {
	
	public static void main(String[] args) 
	{
		
	    
	      String str1 = "Happy Birthday Snehal";
	      String[] SplitString = str1.split(" ");
	      System.out.println("The split string is :");
	      for (String i : SplitString)
	      System.out.println(i);
	      
	      
	      String str2 = "Happy Birthday Abhishek How are";
	      String[] SplitString2 = str2.split(" ", 3);
	      System.out.println('\n' + "The split string is :");
	      for (String i : SplitString2)
	      System.out.println(i);

	      
	      String str3 = "I Dont Know";
	      String[] SplitString3 = str3.split(" ", 5);
	      System.out.println('\n' + "The split string is :");
	      for (String i : SplitString3)
	      System.out.println(i);

	      
	      String str4 = "WhyTareTyouTworriedTsoTmuchT?";
	      String[] SplitString4 = str4.split("T");
	      System.out.println('\n' + "The split string is :");
	      for (String i : SplitString4)
	      System.out.println(i);

	     
	      String JoinedString = String.join(" ", "Happy","Birthday", "Snehal");
	      System.out.print('\n' + "The joined string is :");
	      System.out.println(JoinedString);
	      
	      String JoinedString2 = String.join("", "Happy","Birthday", "Snehal");
	      System.out.print('\n' + "The joined string is :");
	      System.out.println(JoinedString2);
	      
	      String JoinedString3 = String.join("@@@!", "Happy","Birthday", "Snehal");
	      System.out.print('\n' + "The joined string is :");
	      System.out.println(JoinedString3);
	      
	      
	              // java string format() method returns the formatted string
	      
	        String string1 = String.format('\n' +" %s said My name is ", "Amir Singh");  
	        String string2 = String.format("%c", 'Z');          // Char value  
	        String string3 = String.format("%b", "");
	        String string4 = String.format("%b", null);
	        String string5 = String.format("%x",15); //hex value 
	        String string6 = String.format("%04d",34);// Integer value  
	        String string7 = String.format("%.2f", 3.1234f);
	        
	        System.out.println(string1);  
	        System.out.println(string2);  
	        System.out.println(string3); 
	        System.out.println(string4);  
	        System.out.println(string5);
	        System.out.println(string6);  
	        System.out.println(string7);  

	      
	      
	    
	     
	     

	    
	    

	}

}
