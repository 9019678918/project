package Abstraction;

interface Bookmyshow
{
	void movie();
	}
class Bollywood implements Bookmyshow
{
	public void movie()
	{
		System.out.println("Bollywood movie");
	}
	}
class Sandalwood implements Bookmyshow
{
	public void movie()
	{
		System.out.println("sandalwood movie");
	}
	}
class Tollywood implements Bookmyshow
{
	public void movie()
	{
		System.out.println("tollywood movie");
	}
	}
class Orders
{
	static void ordered(Bookmyshow b1)
	{
		b1.movie();
	}
	}
public class Mainclass1 {

	public static void main(String[] args)
	{
		Bollywood b=new Bollywood();
		Tollywood t=new Tollywood();
		Sandalwood s=new Sandalwood();
		Orders.ordered(b);
		Orders.ordered(t);
		Orders.ordered(s);
	}
}
