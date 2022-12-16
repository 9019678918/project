package Tostring;

public class Course {
	int cur_cost;
	String cur_name;
	String cur_type;
	Course(int cur_cost,String cur_name,String cur_type)
	{
		this.cur_cost=cur_cost;
		this.cur_name=cur_name;
		this.cur_type=cur_type;
	}
	public String toString()
	{
		return "course cost is "+this.cur_cost+"course name"+this.cur_name+" course type is"+this.cur_type;
	}
	public static void main(String[] args)
	{
		Course m1=new Course(250000,"vtu","cve");
		System.out.println(m1.toString());
	}
}
