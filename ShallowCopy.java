package package3;

class Department{
	String empId;
	String grade;
	String design;
	
	public Department (String empId, String grade,String design)
	{
		this.empId= empId;
		this.grade= grade;
		this.design =  design;
	}
	
}

class Employee implements Cloneable
{
	int id;
	String name;
	Department dept;
	
	public Employee (int id, String name, Department dept)
	{
	    this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class ShallowCopy {
	
	public static void main (String [] args)
	{
		Department dept1 = new Department ("1", "A", "AVP");
		
		Employee emp1 = new Employee (3, "John", dept1);
		
		Employee emp2 = null;
		
		try {
			emp2 = (Employee) emp1.clone();
		}
		
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("before modification of emp1: " +  emp1.id);
		System.out.println("before modification of emp2: " +  emp2.id + '\n');

        emp1.id = 5;
        
		System.out.println("After modification of emp1: " +  emp1.id);
		System.out.println("After modification of emp2: " +  emp2.id + '\n');
	
		
		System.out.println("before modification of emp1: " + emp1.dept.grade);
		System.out.println("before modification of emp2: " +emp2.dept.grade + '\n');

		emp1.dept.grade = "B";
		
		System.out.println("After modification of emp1: " +emp1.dept.grade);
		System.out.println("After modification of emp2: " +emp2.dept.grade + '\n');
	
		
		
		
		
		
	}
}
