package package3;

class Departments  implements Cloneable
{
	String empId;
	String grade;
	String design;
	
	public Departments (String empId, String grade,String design)
	{
		this.empId= empId;
		this.grade= grade;
		this.design =  design;
		
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

class Employees implements Cloneable
{
	int id;
	String name;
	Departments dept;
	
	public Employees (int id, String name, Departments dept)
	{
	    this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Employees emp = (Employees) super.clone() ;
		emp.dept = (Departments) dept.clone();
		return emp;
	}
	
}

public class DeepCopy {
	
	public static void main (String [] args)
	{
		Departments dept1 = new Departments ("1", "A", "AVP");
		
		Employees emp1 = new Employees (111, "John", dept1);
		
		Employees emp2 = null;
		
		try {
			emp2 = (Employees) emp1.clone();
		}
		
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		

		System.out.println("before modification of emp1: " + emp1.dept.grade);
		System.out.println("before modification of emp2: " +emp2.dept.grade + '\n');

		emp1.dept.grade = "B";
		
		System.out.println("After modification of emp1: " +emp1.dept.grade);
		System.out.println("After modification of emp2: " +emp2.dept.grade + '\n');
	
		

}
}
