package Abstraction;

interface Tea
{
	void taste();
	}
class Lemon_tea implements Tea
{
	public void taste()
	{
		System.out.println("lemon tea taste");
	}
	}
class Green_tea implements Tea
{
	public void taste()
	{
		System.out.println("green tea taste");
	}
	}
class Black_tea implements Tea
{
	public void taste()
	{
		System.out.println("balck tea taste");
	}
	}
class Taste
{
	static void tasted(Tea t1)
	{
		t1.taste();
	}
	}
public class Mainclass5 {
public static void main(String[] args)
{
	Lemon_tea l=new Lemon_tea();
	Green_tea g=new Green_tea();
	Black_tea b=new Black_tea();
	Taste.tasted(l);
	Taste.tasted(g);
	Taste.tasted(b);
	}
}
