package Tostring;

public class Bike {
	int bike_cost;
	String bike_brand;
	String bike_col;
	Bike(int bike_cost,String bike_brand,String bike_col)
	{
		this.bike_cost=bike_cost;
		this.bike_brand=bike_brand;
		this.bike_col=bike_col;
	}
	public String toString()
	{
		return "bike cost is "+this.bike_cost+"bike barnd name"+this.bike_brand+" bike color is"+this.bike_col;
	}
	public static void main(String[] args)
	{
		Bike b1=new Bike(2500,"re","black");
		System.out.println(b1.toString());
	}
}
