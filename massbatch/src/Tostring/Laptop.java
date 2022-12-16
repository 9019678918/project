package Tostring;

public class Laptop {
	int lap_cost;
	String lap_name;
	String lap_brand;
	Laptop(int lap_cost,String lap_name,String lap_brand)
	{
		this.lap_cost=lap_cost;
		this.lap_name=lap_name;
		this.lap_brand=lap_brand;
	}
	public String toString()
	{
		return "lap cost is "+this.lap_cost+"lap model name"+this.lap_name+"lap brand is"+this.lap_brand;
	}
	public static void main(String[] args)
	{
		Laptop l1=new Laptop(250000,"hp","pavilion");
		System.out.println(l1.toString());
	}
}
