package package1;

class Employee {
	
	 private Integer id;
	 private String firstname;
	private String lastName;
	 private String department;
	 
	void  setId (int id) 
	 {
		this.id = id;
	}
	int  getId ()
	 {
		 return id;
	}
	
	void setfirstname(String x)
	{
		this.firstname = firstname;
	}
	
	String getfirstname()
	{
		return firstname;
	}
	
	
}
public class StringFunctions {
	
			public static void main(String[] args) 
			{
			 Employee e1 = new Employee();
			Employee e2 = new Employee();
			e1.setId(100);
			 e2.setId(100);
			 System.out.println(e1.equals(e2));
			//false
			 
			 e1 = e2;
			 System.out.println(e1.equals(e2));
			 
			 System.out.println(e1.getId());
			 System.out.println(e2.getId());

	
	}

}
