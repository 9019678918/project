package Tostring;

public class Employee {
	int emp_id;
	int sal;
	char grade;
	Employee(int emp_id,int sal,char grade)
	{
		this.emp_id=emp_id;
		this.sal=sal;
		this.grade=grade;
	}
	public String toString()
	{
		return "emp id is "+this.emp_id+"emp sal"+this.sal+"emp grade is"+this.grade;
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(2,200000,'a');
		System.out.println(e1.toString());
	}
}
