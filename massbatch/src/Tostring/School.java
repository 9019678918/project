package Tostring;

public class School {
	int sch_str;
	String sch_name;
	String sch_grade;
	School(int sch_str,String sch_name,String sch_grade)
	{
		this.sch_str=sch_str;
		this.sch_name=sch_name;
		this.sch_grade=sch_grade;
	}
	public String toString()
	{
		return "car cost is "+this.sch_str+"car model name"+this.sch_name+" car type is"+this.sch_grade;
	}
	public static void main(String[] args)
	{
		School s1=new School(250000,"sjr","a1");
		System.out.println(s1.toString());
	}
}
