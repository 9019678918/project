package Tostring;

public class Home {
	int home_cost;
	String home_name;
	String home_color;
	Home(int home_cost,String home_name,String home_color)
	{
		this.home_cost=home_cost;
		this.home_name=home_name;
		this.home_color=home_color;
	}
	public String toString()
	{
		return "home cost is "+this.home_cost+"home name"+this.home_name+" home color is"+this.home_color;
	}
	public static void main(String[] args)
	{
		Home h1=new Home(250000,"ap","aulion");
		System.out.println(h1.toString());
	}
}
