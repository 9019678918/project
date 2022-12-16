package Tostring;

public class Mobile {
	int mob_cost;
	String mod_name;
	String mob_col;
	Mobile(int mob_cost,String mod_name,String mob_col)
	{
		this.mob_cost=mob_cost;
		this.mod_name=mod_name;
		this.mob_col=mob_col;
	}
	public String toString()
	{
		return "mobile cost is "+this.mob_cost+"mobile model name"+this.mod_name+"mobil color is"+this.mob_col;
	}
	public static void main(String[] args)
	{
		Mobile m1=new Mobile(10000,"redmi","blue");
		System.out.println(m1.toString());
	}

}
