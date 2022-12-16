package Tostring;

public class Cloth {
	int cloth_cost;
	String cloth_col;
	String cloth_size;
	Cloth(int cloth_cost,String cloth_col,String cloth_size)
	{
		this.cloth_cost=cloth_cost;
		this.cloth_col=cloth_col;
		this.cloth_size=cloth_size;
	}
	public String toString()
	{
		return "cloth cost is "+this.cloth_cost+"cloth color name"+this.cloth_col+"cloth size is"+this.cloth_size;
	}
	public static void main(String[] args)
	{
		Cloth c1=new Cloth(250,"white","x");
		System.out.println(c1.toString());
	}
}
