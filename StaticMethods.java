package Package2;


/*
 * 2. Program to define usage of multiple static block 
which updates the values of 
 * various data members;
 */

class A {
	static int a;
	static float b;
	
	A ()
	{
		System.out.println("Default constructor");

	}
	
	{
		System.out.println("Instance  block");
	}
	static 
	{
		System.out.println("Initial values of a: " + a);
		System.out.println("Initial values of b: " + b);
	}
	
	static 
	{
		System.out.println("Assiging values to variables");
		 a = 10;
		 b= 20.5f;
		 
		 System.out.println("Value of a: " + a);
		 System.out.println("Value of b: " + b);
			
	}
	
	static 
	{
		System.out.println("Updating values of variables");
		 a = 30;
		 b= 47.67f;
		 
		 System.out.println(" Changed Value of a: " + a);
		 System.out.println(" Changed Value of b: " + b);

	}
	
	static 
	{
		System.out.println("Decrementing values");
		 a--;
		 b--;
		 
		 System.out.println("Decremented Value of a: " + a);
		 System.out.println("Decremented Value of b: " + b);

	}
	
	
	
	static void function1()
	{
		System.out.println("Static Method");
		
		
	}
		
	void funtion2()
	{
		System.out.println("Instance  Method");
	}


	
	
	
}

class StaticMethods
{
	public static void main(String[] args) 
	{
		A obj = new A() ;
		//function1();
		// funtion2()
		//obj.funtion2();
		
		
	

	
	}
}


